/**
 * <copyright>
 * 
 * Copyright (c) 2007, 2009 IBM Corporation, Zeligsoft Inc., and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   IBM - Initial API and implementation
 *   Zeligsoft - Bug 207365
 * 
 * </copyright>
 *
 * $Id: TypeExpImpl.java,v 1.8 2010/04/23 05:52:13 ewillink Exp $
 */
package org.modeldriven.magicdraw.niem.validation.ocl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.expressions.ExpressionsPackage;
//import org.eclipse.ocl.uml.TypeExp;
//import org.eclipse.ocl.uml.UMLPackage;
import org.eclipse.ocl.utilities.Visitor;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
//import org.eclipse.uml2.uml.Classifier;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ocl.uml.impl.TypeExpImpl#getReferredType <em>Referred Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("restriction")
public class TypeExpImpl
		extends OCLExpressionImpl
		implements TypeExp {

	/**
	 * The cached value of the '{@link #getReferredType() <em>Referred Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferredType()
	 * @generated
	 * @ordered
	 */
	protected Classifier referredType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.TYPE_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getReferredType() {
		if (referredType != null && ((EObject) referredType).eIsProxy()) {
			InternalEObject oldReferredType = (InternalEObject) referredType;
			referredType = (Classifier) eResolveProxy(oldReferredType);
			if (referredType != oldReferredType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						UMLPackage.TYPE_EXP__REFERRED_TYPE, oldReferredType,
						referredType));
			}
		}
//		log("TypeExp.getReferredType "+referredType);
		//if(referredType!=null)log("TypeExp.getReferredType "+referredType.getQualifiedName());
		return referredType;
	}
	static public void log(String text){
		QvtCommonAction.log(text);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetReferredType() {
//		log("TypeExp.basicGetReferredType "+referredType);
		if(referredType!=null)log("TypeExp.basicGetReferredType "+referredType.getQualifiedName());
		return referredType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public void setReferredType(Classifier newReferredType) {
		Classifier oldReferredType = referredType;
		referredType = newReferredType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
				UMLPackage.TYPE_EXP__REFERRED_TYPE, oldReferredType,
				referredType));
		//if(referredType!=null)log("TypeExp.setReferredType "+referredType.getQualifiedName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		// we never get called for referred_type
		switch (featureID) {
			case UMLPackage.TYPE_EXP__REFERRED_TYPE :
				if (resolve)
					return getReferredType();
				return basicGetReferredType();
			default:
				//log("TypeExp.eGet "+featureID+", "+UMLPackage.TYPE_EXP__REFERRED_TYPE+", "+ExpressionsPackage.TYPE_EXP__REFERRED_TYPE);
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.TYPE_EXP__REFERRED_TYPE :
				setReferredType((Classifier) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UMLPackage.TYPE_EXP__REFERRED_TYPE :
				setReferredType((Classifier) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UMLPackage.TYPE_EXP__REFERRED_TYPE :
				return referredType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == org.eclipse.ocl.expressions.TypeExp.class) {
			switch (derivedFeatureID) {
				case UMLPackage.TYPE_EXP__REFERRED_TYPE :
					return ExpressionsPackage.TYPE_EXP__REFERRED_TYPE;
				default :
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == org.eclipse.ocl.expressions.TypeExp.class) {
			switch (baseFeatureID) {
				case ExpressionsPackage.TYPE_EXP__REFERRED_TYPE :
					return UMLPackage.TYPE_EXP__REFERRED_TYPE;
				default :
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	@SuppressWarnings("unchecked")
	public <T, U extends Visitor<T, ?, ?, ?, ?, ?, ?, ?, ?, ?>> T accept(U v) {
		return ((Visitor<T, Classifier, ?, ?, ?, ?, ?, ?, ?, ?>) v)
			.visitTypeExp(this);
	}
//////////////////////////////////////////////////////////////////////////////////

	@Override
	public Classifier getType() {
		// override in order to unambiguously narrow the return type
//		return (Classifier) super.getType();
		Classifier result= (Classifier) super.getType();
		//if(result!=null)log("TypeExp.getType "+(result==null?"null":(result.getQualifiedName()+", "+result.getClass().getName()))+", "+(referredType==null?"null":referredType.getQualifiedName()));
		//result=referredType;// does this always work?
		return result;
	}

	public void setType(Classifier typeIn) {
		Classifier type=typeIn;
		//type=referredType;
		setType((Type) type);
		//if(type!=null)log("TypeExp.setType "+(typeIn==null?"null":(typeIn.getQualifiedName()+", "+typeIn.getClass().getName()))+", "+(type==null?"null":type.getQualifiedName())+", "+(referredType==null?"null":referredType.getQualifiedName()));
	}

} //TypeExpImpl
