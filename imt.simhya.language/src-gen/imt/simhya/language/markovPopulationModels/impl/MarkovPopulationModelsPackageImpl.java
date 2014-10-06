/**
 */
package imt.simhya.language.markovPopulationModels.impl;

import imt.simhya.language.markovPopulationModels.MarkovPopulationModelsFactory;
import imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage;
import imt.simhya.language.markovPopulationModels.action;
import imt.simhya.language.markovPopulationModels.action_cond;
import imt.simhya.language.markovPopulationModels.agent;
import imt.simhya.language.markovPopulationModels.anystate;
import imt.simhya.language.markovPopulationModels.constant;
import imt.simhya.language.markovPopulationModels.expr;
import imt.simhya.language.markovPopulationModels.gl_tran;
import imt.simhya.language.markovPopulationModels.init;
import imt.simhya.language.markovPopulationModels.label;
import imt.simhya.language.markovPopulationModels.loc_tran;
import imt.simhya.language.markovPopulationModels.local_rate;
import imt.simhya.language.markovPopulationModels.main;
import imt.simhya.language.markovPopulationModels.population;
import imt.simhya.language.markovPopulationModels.state;
import imt.simhya.language.markovPopulationModels.stateInit;
import imt.simhya.language.markovPopulationModels.state_cond;
import imt.simhya.language.markovPopulationModels.state_ref;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MarkovPopulationModelsPackageImpl extends EPackageImpl implements MarkovPopulationModelsPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mainEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass agentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass local_rateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass populationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass initEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateInitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gl_tranEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loc_tranEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass state_condEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass state_refEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass action_condEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anystateEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see imt.simhya.language.markovPopulationModels.MarkovPopulationModelsPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MarkovPopulationModelsPackageImpl()
  {
    super(eNS_URI, MarkovPopulationModelsFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MarkovPopulationModelsPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MarkovPopulationModelsPackage init()
  {
    if (isInited) return (MarkovPopulationModelsPackage)EPackage.Registry.INSTANCE.getEPackage(MarkovPopulationModelsPackage.eNS_URI);

    // Obtain or create and register package
    MarkovPopulationModelsPackageImpl theMarkovPopulationModelsPackage = (MarkovPopulationModelsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MarkovPopulationModelsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MarkovPopulationModelsPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMarkovPopulationModelsPackage.createPackageContents();

    // Initialize created meta-data
    theMarkovPopulationModelsPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMarkovPopulationModelsPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MarkovPopulationModelsPackage.eNS_URI, theMarkovPopulationModelsPackage);
    return theMarkovPopulationModelsPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getmain()
  {
    return mainEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmain_ConstDef()
  {
    return (EReference)mainEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmain_PopulationDef()
  {
    return (EReference)mainEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmain_AgentDef()
  {
    return (EReference)mainEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getconstant()
  {
    return constantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getconstant_Name()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getconstant_ConstINT()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getconstant_ConstFLOAT()
  {
    return (EAttribute)constantEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getagent()
  {
    return agentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getagent_Name()
  {
    return (EAttribute)agentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getagent_Act()
  {
    return (EReference)agentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getagent_S()
  {
    return (EReference)agentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlabel()
  {
    return labelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getlabel_Name()
  {
    return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstate()
  {
    return stateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getstate_Name()
  {
    return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstate_SpontaneousAct()
  {
    return (EReference)stateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getaction()
  {
    return actionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getaction_ActRef()
  {
    return (EReference)actionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getaction_StateRef()
  {
    return (EReference)actionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getaction_LocalRate()
  {
    return (EReference)actionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlocal_rate()
  {
    return local_rateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlocal_rate_ConstRef()
  {
    return (EReference)local_rateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getlocal_rate_LocalRate()
  {
    return (EAttribute)local_rateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getpopulation()
  {
    return populationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpopulation_Name()
  {
    return (EAttribute)populationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getpopulation_Agents()
  {
    return (EReference)populationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getpopulation_Tran()
  {
    return (EReference)populationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getinit()
  {
    return initEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getinit_AgentRef()
  {
    return (EReference)initEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getinit_States()
  {
    return (EReference)initEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstateInit()
  {
    return stateInitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstateInit_StateRef()
  {
    return (EReference)stateInitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getstateInit_Card()
  {
    return (EAttribute)stateInitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getgl_tran()
  {
    return gl_tranEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getgl_tran_Name()
  {
    return (EAttribute)gl_tranEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getgl_tran_LTran()
  {
    return (EReference)gl_tranEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getgl_tran_Rate()
  {
    return (EReference)gl_tranEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getloc_tran()
  {
    return loc_tranEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getloc_tran_StateRef()
  {
    return (EReference)loc_tranEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getloc_tran_SCond()
  {
    return (EReference)loc_tranEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getloc_tran_ACond()
  {
    return (EReference)loc_tranEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstate_cond()
  {
    return state_condEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstate_cond_StateRef()
  {
    return (EReference)state_condEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstate_ref()
  {
    return state_refEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstate_ref_StateRef()
  {
    return (EReference)state_refEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getaction_cond()
  {
    return action_condEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getaction_cond_ActionRef()
  {
    return (EReference)action_condEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getexpr()
  {
    return exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexpr_ConstRef()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getexpr_ConstFLOAT()
  {
    return (EAttribute)exprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getexpr_ConstINT()
  {
    return (EAttribute)exprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getanystate()
  {
    return anystateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MarkovPopulationModelsFactory getMarkovPopulationModelsFactory()
  {
    return (MarkovPopulationModelsFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    mainEClass = createEClass(MAIN);
    createEReference(mainEClass, MAIN__CONST_DEF);
    createEReference(mainEClass, MAIN__POPULATION_DEF);
    createEReference(mainEClass, MAIN__AGENT_DEF);

    constantEClass = createEClass(CONSTANT);
    createEAttribute(constantEClass, CONSTANT__NAME);
    createEAttribute(constantEClass, CONSTANT__CONST_INT);
    createEAttribute(constantEClass, CONSTANT__CONST_FLOAT);

    agentEClass = createEClass(AGENT);
    createEAttribute(agentEClass, AGENT__NAME);
    createEReference(agentEClass, AGENT__ACT);
    createEReference(agentEClass, AGENT__S);

    labelEClass = createEClass(LABEL);
    createEAttribute(labelEClass, LABEL__NAME);

    stateEClass = createEClass(STATE);
    createEAttribute(stateEClass, STATE__NAME);
    createEReference(stateEClass, STATE__SPONTANEOUS_ACT);

    actionEClass = createEClass(ACTION);
    createEReference(actionEClass, ACTION__ACT_REF);
    createEReference(actionEClass, ACTION__STATE_REF);
    createEReference(actionEClass, ACTION__LOCAL_RATE);

    local_rateEClass = createEClass(LOCAL_RATE);
    createEReference(local_rateEClass, LOCAL_RATE__CONST_REF);
    createEAttribute(local_rateEClass, LOCAL_RATE__LOCAL_RATE);

    populationEClass = createEClass(POPULATION);
    createEAttribute(populationEClass, POPULATION__NAME);
    createEReference(populationEClass, POPULATION__AGENTS);
    createEReference(populationEClass, POPULATION__TRAN);

    initEClass = createEClass(INIT);
    createEReference(initEClass, INIT__AGENT_REF);
    createEReference(initEClass, INIT__STATES);

    stateInitEClass = createEClass(STATE_INIT);
    createEReference(stateInitEClass, STATE_INIT__STATE_REF);
    createEAttribute(stateInitEClass, STATE_INIT__CARD);

    gl_tranEClass = createEClass(GL_TRAN);
    createEAttribute(gl_tranEClass, GL_TRAN__NAME);
    createEReference(gl_tranEClass, GL_TRAN__LTRAN);
    createEReference(gl_tranEClass, GL_TRAN__RATE);

    loc_tranEClass = createEClass(LOC_TRAN);
    createEReference(loc_tranEClass, LOC_TRAN__STATE_REF);
    createEReference(loc_tranEClass, LOC_TRAN__SCOND);
    createEReference(loc_tranEClass, LOC_TRAN__ACOND);

    state_condEClass = createEClass(STATE_COND);
    createEReference(state_condEClass, STATE_COND__STATE_REF);

    state_refEClass = createEClass(STATE_REF);
    createEReference(state_refEClass, STATE_REF__STATE_REF);

    action_condEClass = createEClass(ACTION_COND);
    createEReference(action_condEClass, ACTION_COND__ACTION_REF);

    exprEClass = createEClass(EXPR);
    createEReference(exprEClass, EXPR__CONST_REF);
    createEAttribute(exprEClass, EXPR__CONST_FLOAT);
    createEAttribute(exprEClass, EXPR__CONST_INT);

    anystateEClass = createEClass(ANYSTATE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    anystateEClass.getESuperTypes().add(this.getstate_cond());
    anystateEClass.getESuperTypes().add(this.getaction_cond());

    // Initialize classes and features; add operations and parameters
    initEClass(mainEClass, main.class, "main", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getmain_ConstDef(), this.getconstant(), null, "constDef", null, 0, -1, main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getmain_PopulationDef(), this.getpopulation(), null, "populationDef", null, 0, 1, main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getmain_AgentDef(), this.getagent(), null, "agentDef", null, 0, 1, main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantEClass, constant.class, "constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getconstant_Name(), ecorePackage.getEString(), "name", null, 0, 1, constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getconstant_ConstINT(), ecorePackage.getEInt(), "constINT", null, 0, 1, constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getconstant_ConstFLOAT(), ecorePackage.getEDouble(), "constFLOAT", null, 0, 1, constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(agentEClass, agent.class, "agent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getagent_Name(), ecorePackage.getEString(), "name", null, 0, 1, agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getagent_Act(), this.getlabel(), null, "act", null, 0, -1, agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getagent_S(), this.getstate(), null, "s", null, 0, -1, agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(labelEClass, label.class, "label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getlabel_Name(), ecorePackage.getEString(), "name", null, 0, 1, label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateEClass, state.class, "state", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getstate_Name(), ecorePackage.getEString(), "name", null, 0, 1, state.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstate_SpontaneousAct(), this.getaction(), null, "spontaneousAct", null, 0, -1, state.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionEClass, action.class, "action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getaction_ActRef(), this.getlabel(), null, "actRef", null, 0, 1, action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getaction_StateRef(), this.getstate(), null, "stateRef", null, 0, 1, action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getaction_LocalRate(), this.getlocal_rate(), null, "localRate", null, 0, 1, action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(local_rateEClass, local_rate.class, "local_rate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getlocal_rate_ConstRef(), this.getconstant(), null, "constRef", null, 0, 1, local_rate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getlocal_rate_LocalRate(), ecorePackage.getEDouble(), "localRate", null, 0, 1, local_rate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(populationEClass, population.class, "population", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getpopulation_Name(), ecorePackage.getEString(), "name", null, 0, 1, population.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getpopulation_Agents(), this.getinit(), null, "agents", null, 0, -1, population.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getpopulation_Tran(), this.getgl_tran(), null, "tran", null, 0, -1, population.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(initEClass, init.class, "init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getinit_AgentRef(), this.getagent(), null, "agentRef", null, 0, 1, init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getinit_States(), this.getstateInit(), null, "states", null, 0, -1, init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateInitEClass, stateInit.class, "stateInit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getstateInit_StateRef(), this.getstate(), null, "stateRef", null, 0, 1, stateInit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getstateInit_Card(), ecorePackage.getEInt(), "card", null, 0, 1, stateInit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(gl_tranEClass, gl_tran.class, "gl_tran", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getgl_tran_Name(), ecorePackage.getEString(), "name", null, 0, 1, gl_tran.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getgl_tran_LTran(), this.getloc_tran(), null, "lTran", null, 0, -1, gl_tran.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getgl_tran_Rate(), this.getexpr(), null, "rate", null, 0, 1, gl_tran.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(loc_tranEClass, loc_tran.class, "loc_tran", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getloc_tran_StateRef(), this.getstate(), null, "stateRef", null, 0, 1, loc_tran.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getloc_tran_SCond(), this.getstate_cond(), null, "sCond", null, 0, 1, loc_tran.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getloc_tran_ACond(), this.getaction_cond(), null, "aCond", null, 0, 1, loc_tran.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(state_condEClass, state_cond.class, "state_cond", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getstate_cond_StateRef(), this.getstate_ref(), null, "stateRef", null, 0, -1, state_cond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(state_refEClass, state_ref.class, "state_ref", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getstate_ref_StateRef(), this.getstate(), null, "stateRef", null, 0, 1, state_ref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(action_condEClass, action_cond.class, "action_cond", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getaction_cond_ActionRef(), this.getlabel(), null, "actionRef", null, 0, 1, action_cond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprEClass, expr.class, "expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getexpr_ConstRef(), this.getconstant(), null, "constRef", null, 0, 1, expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getexpr_ConstFLOAT(), ecorePackage.getEDouble(), "constFLOAT", null, 0, 1, expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getexpr_ConstINT(), ecorePackage.getEInt(), "constINT", null, 0, 1, expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(anystateEClass, anystate.class, "anystate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //MarkovPopulationModelsPackageImpl
