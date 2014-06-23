/**
 */
package gov.niem.reference.niem.resource.mpd.catalog._3._0.impl;

import gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.ReferenceSchemaDocumentSetType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Schema Document Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.ReferenceSchemaDocumentSetTypeImpl#getReferenceSchemaDocument <em>Reference Schema Document</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceSchemaDocumentSetTypeImpl extends FileSetTypeImpl implements ReferenceSchemaDocumentSetType {
	/**
	 * The cached value of the '{@link #getReferenceSchemaDocument() <em>Reference Schema Document</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceSchemaDocument()
	 * @generated
	 * @ordered
	 */
	protected EList<FileType> referenceSchemaDocument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceSchemaDocumentSetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.Literals.REFERENCE_SCHEMA_DOCUMENT_SET_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FileType> getReferenceSchemaDocument() {
		if (referenceSchemaDocument == null) {
			referenceSchemaDocument = new EObjectContainmentEList<FileType>(FileType.class, this, _0Package.REFERENCE_SCHEMA_DOCUMENT_SET_TYPE__REFERENCE_SCHEMA_DOCUMENT);
		}
		return referenceSchemaDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.REFERENCE_SCHEMA_DOCUMENT_SET_TYPE__REFERENCE_SCHEMA_DOCUMENT:
				return ((InternalEList<?>)getReferenceSchemaDocument()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _0Package.REFERENCE_SCHEMA_DOCUMENT_SET_TYPE__REFERENCE_SCHEMA_DOCUMENT:
				return getReferenceSchemaDocument();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _0Package.REFERENCE_SCHEMA_DOCUMENT_SET_TYPE__REFERENCE_SCHEMA_DOCUMENT:
				getReferenceSchemaDocument().clear();
				getReferenceSchemaDocument().addAll((Collection<? extends FileType>)newValue);
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
			case _0Package.REFERENCE_SCHEMA_DOCUMENT_SET_TYPE__REFERENCE_SCHEMA_DOCUMENT:
				getReferenceSchemaDocument().clear();
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
			case _0Package.REFERENCE_SCHEMA_DOCUMENT_SET_TYPE__REFERENCE_SCHEMA_DOCUMENT:
				return referenceSchemaDocument != null && !referenceSchemaDocument.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReferenceSchemaDocumentSetTypeImpl
