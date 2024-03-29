/**
 * generated by Xtext
 */
package imt.simhya.language.generator;

import com.google.common.base.Objects;
import imt.simhya.language.markovPopulationModels.Expression;
import imt.simhya.language.markovPopulationModels.FloatExpression;
import imt.simhya.language.markovPopulationModels.IntExpression;
import imt.simhya.language.markovPopulationModels.MultiplicationDivision;
import imt.simhya.language.markovPopulationModels.Reference;
import imt.simhya.language.markovPopulationModels.SummationSubtraction;
import imt.simhya.language.markovPopulationModels.action;
import imt.simhya.language.markovPopulationModels.action_cond;
import imt.simhya.language.markovPopulationModels.gl_tran;
import imt.simhya.language.markovPopulationModels.init;
import imt.simhya.language.markovPopulationModels.label;
import imt.simhya.language.markovPopulationModels.loc_tran;
import imt.simhya.language.markovPopulationModels.main;
import imt.simhya.language.markovPopulationModels.population;
import imt.simhya.language.markovPopulationModels.state;
import imt.simhya.language.markovPopulationModels.stateInit;
import imt.simhya.language.markovPopulationModels.state_cond;
import imt.simhya.language.markovPopulationModels.state_ref;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class MarkovPopulationModelsGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    EObject _get = _contents.get(0);
    main prog = ((main) _get);
    CharSequence _simhya = this.toSimhya(prog);
    fsa.generateFile("paperino.txt", _simhya);
  }
  
  public CharSequence toSimhya(final main m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("model ");
    population _populationDef = m.getPopulationDef();
    String _name = _populationDef.getName();
    _builder.append(_name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      population _populationDef_1 = m.getPopulationDef();
      EList<init> _agents = _populationDef_1.getAgents();
      init _get = _agents.get(0);
      EList<stateInit> _states = _get.getStates();
      for(final stateInit s : _states) {
        _builder.append("\t");
        state_ref _stateRef = s.getStateRef();
        state _stateRef_1 = _stateRef.getStateRef();
        String _name_1 = _stateRef_1.getName();
        _builder.append(_name_1, "\t");
        _builder.append(" = ");
        Expression _card = s.getCard();
        int _value = ((IntExpression) _card).getValue();
        _builder.append(_value, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      population _populationDef_2 = m.getPopulationDef();
      EList<gl_tran> _tran = _populationDef_2.getTran();
      for(final gl_tran t : _tran) {
        _builder.append("\t");
        String _name_2 = t.getName();
        _builder.append(_name_2, "\t");
        _builder.append(":[ :-> ");
        CharSequence _updateVector = this.updateVector(t);
        _builder.append(_updateVector, "\t");
        _builder.append("]@");
        Expression _rate = t.getRate();
        CharSequence _evaluate = this.evaluate(_rate);
        _builder.append(_evaluate, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("reg:[  :-> ]@{0.0001};");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _evaluate(final SummationSubtraction ss) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _left = ss.getLeft();
    CharSequence _evaluate = this.evaluate(_left);
    _builder.append(_evaluate, "");
    {
      String _op = ss.getOp();
      boolean _equals = _op.equals("+");
      if (_equals) {
        _builder.append(" + ");
      } else {
        _builder.append(" - ");
      }
    }
    Expression _right = ss.getRight();
    CharSequence _evaluate_1 = this.evaluate(_right);
    _builder.append(_evaluate_1, "");
    return _builder;
  }
  
  protected CharSequence _evaluate(final MultiplicationDivision md) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _left = md.getLeft();
    CharSequence _evaluate = this.evaluate(_left);
    _builder.append(_evaluate, "");
    {
      String _op = md.getOp();
      boolean _equals = _op.equals("*");
      if (_equals) {
        _builder.append(" * ");
      } else {
        _builder.append(" / ");
      }
    }
    Expression _right = md.getRight();
    CharSequence _evaluate_1 = this.evaluate(_right);
    _builder.append(_evaluate_1, "");
    return _builder;
  }
  
  protected CharSequence _evaluate(final IntExpression ie) {
    StringConcatenation _builder = new StringConcatenation();
    int _value = ie.getValue();
    _builder.append(_value, "");
    return _builder;
  }
  
  protected CharSequence _evaluate(final FloatExpression fe) {
    StringConcatenation _builder = new StringConcatenation();
    double _value = fe.getValue();
    _builder.append(_value, "");
    return _builder;
  }
  
  protected CharSequence _evaluate(final Reference ref) {
    StringConcatenation _builder = new StringConcatenation();
    state_ref _stateRef = ref.getStateRef();
    state _stateRef_1 = _stateRef.getStateRef();
    String _name = _stateRef_1.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  public CharSequence updateVector(final gl_tran tran) {
    CharSequence _xblockexpression = null;
    {
      HashMap<state, Integer> uv = CollectionLiterals.<state, Integer>newHashMap();
      EList<loc_tran> _lTran = tran.getLTran();
      for (final loc_tran l : _lTran) {
        {
          state_cond _sCond = l.getSCond();
          state_ref _stateRef = _sCond.getStateRef();
          state s = _stateRef.getStateRef();
          Integer v = uv.get(s);
          boolean _equals = Objects.equal(v, null);
          if (_equals) {
            uv.put(s, Integer.valueOf((-1)));
          } else {
            uv.put(s, Integer.valueOf(((v).intValue() - 1)));
          }
          EList<action> _spontaneousAct = s.getSpontaneousAct();
          for (final action a : _spontaneousAct) {
            label _actRef = a.getActRef();
            action_cond _aCond = l.getACond();
            label _actionRef = _aCond.getActionRef();
            boolean _equals_1 = _actRef.equals(_actionRef);
            if (_equals_1) {
              state _stateRef_1 = a.getStateRef();
              Integer _get = uv.get(_stateRef_1);
              v = _get;
              boolean _equals_2 = Objects.equal(v, null);
              if (_equals_2) {
                state _stateRef_2 = a.getStateRef();
                uv.put(_stateRef_2, Integer.valueOf(1));
              } else {
                state _stateRef_3 = a.getStateRef();
                uv.put(_stateRef_3, Integer.valueOf(((v).intValue() + 1)));
              }
            }
          }
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      {
        Set<state> _keySet = uv.keySet();
        boolean _hasElements = false;
        for(final state k : _keySet) {
          if (!_hasElements) {
            _hasElements = true;
          } else {
            _builder.appendImmediate(";", "");
          }
          {
            Integer _get = uv.get(k);
            boolean _notEquals = ((_get).intValue() != 0);
            if (_notEquals) {
              {
                Integer _get_1 = uv.get(k);
                boolean _greaterThan = ((_get_1).intValue() > 0);
                if (_greaterThan) {
                  String _name = k.getName();
                  _builder.append(_name, "");
                  _builder.append(" += ");
                  Integer _get_2 = uv.get(k);
                  _builder.append(_get_2, "");
                } else {
                  String _name_1 = k.getName();
                  _builder.append(_name_1, "");
                  _builder.append(" -= ");
                  Integer _get_3 = uv.get(k);
                  int _minus = (-(_get_3).intValue());
                  _builder.append(_minus, "");
                }
              }
            }
          }
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence evaluate(final Expression fe) {
    if (fe instanceof FloatExpression) {
      return _evaluate((FloatExpression)fe);
    } else if (fe instanceof IntExpression) {
      return _evaluate((IntExpression)fe);
    } else if (fe instanceof MultiplicationDivision) {
      return _evaluate((MultiplicationDivision)fe);
    } else if (fe instanceof Reference) {
      return _evaluate((Reference)fe);
    } else if (fe instanceof SummationSubtraction) {
      return _evaluate((SummationSubtraction)fe);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(fe).toString());
    }
  }
}
