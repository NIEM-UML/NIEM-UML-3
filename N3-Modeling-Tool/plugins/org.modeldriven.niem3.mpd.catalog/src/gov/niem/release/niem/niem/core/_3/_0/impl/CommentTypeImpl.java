/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.CommentType;
import gov.niem.release.niem.niem.core._3._0.DateType;
import gov.niem.release.niem.niem.core._3._0.TextType;
import gov.niem.release.niem.niem.core._3._0._0Package;

import gov.niem.release.niem.structures._3._0.impl.ObjectTypeImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CommentTypeImpl#getCommentAuthorText <em>Comment Author Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CommentTypeImpl#getCommentCreationDate <em>Comment Creation Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CommentTypeImpl#getCommentText <em>Comment Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CommentTypeImpl#getCommentTitleText <em>Comment Title Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CommentTypeImpl#getCommentAugmentationPointGroup <em>Comment Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CommentTypeImpl#getCommentAugmentationPoint <em>Comment Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommentTypeImpl extends ObjectTypeImpl implements CommentType {
	/**
	 * The cached value of the '{@link #getCommentAuthorText() <em>Comment Author Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentAuthorText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> commentAuthorText;

	/**
	 * The cached value of the '{@link #getCommentCreationDate() <em>Comment Creation Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentCreationDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> commentCreationDate;

	/**
	 * The cached value of the '{@link #getCommentText() <em>Comment Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> commentText;

	/**
	 * The cached value of the '{@link #getCommentTitleText() <em>Comment Title Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentTitleText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> commentTitleText;

	/**
	 * The cached value of the '{@link #getCommentAugmentationPointGroup() <em>Comment Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap commentAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getCommentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getCommentAuthorText() {
		if (commentAuthorText == null) {
			commentAuthorText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.COMMENT_TYPE__COMMENT_AUTHOR_TEXT);
		}
		return commentAuthorText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getCommentCreationDate() {
		if (commentCreationDate == null) {
			commentCreationDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.COMMENT_TYPE__COMMENT_CREATION_DATE);
		}
		return commentCreationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getCommentText() {
		if (commentText == null) {
			commentText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.COMMENT_TYPE__COMMENT_TEXT);
		}
		return commentText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getCommentTitleText() {
		if (commentTitleText == null) {
			commentTitleText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.COMMENT_TYPE__COMMENT_TITLE_TEXT);
		}
		return commentTitleText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getCommentAugmentationPointGroup() {
		if (commentAugmentationPointGroup == null) {
			commentAugmentationPointGroup = new BasicFeatureMap(this, _0Package.COMMENT_TYPE__COMMENT_AUGMENTATION_POINT_GROUP);
		}
		return commentAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getCommentAugmentationPoint() {
		return getCommentAugmentationPointGroup().list(_0Package.eINSTANCE.getCommentType_CommentAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.COMMENT_TYPE__COMMENT_AUTHOR_TEXT:
				return ((InternalEList<?>)getCommentAuthorText()).basicRemove(otherEnd, msgs);
			case _0Package.COMMENT_TYPE__COMMENT_CREATION_DATE:
				return ((InternalEList<?>)getCommentCreationDate()).basicRemove(otherEnd, msgs);
			case _0Package.COMMENT_TYPE__COMMENT_TEXT:
				return ((InternalEList<?>)getCommentText()).basicRemove(otherEnd, msgs);
			case _0Package.COMMENT_TYPE__COMMENT_TITLE_TEXT:
				return ((InternalEList<?>)getCommentTitleText()).basicRemove(otherEnd, msgs);
			case _0Package.COMMENT_TYPE__COMMENT_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getCommentAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.COMMENT_TYPE__COMMENT_AUGMENTATION_POINT:
				return ((InternalEList<?>)getCommentAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.COMMENT_TYPE__COMMENT_AUTHOR_TEXT:
				return getCommentAuthorText();
			case _0Package.COMMENT_TYPE__COMMENT_CREATION_DATE:
				return getCommentCreationDate();
			case _0Package.COMMENT_TYPE__COMMENT_TEXT:
				return getCommentText();
			case _0Package.COMMENT_TYPE__COMMENT_TITLE_TEXT:
				return getCommentTitleText();
			case _0Package.COMMENT_TYPE__COMMENT_AUGMENTATION_POINT_GROUP:
				if (coreType) return getCommentAugmentationPointGroup();
				return ((FeatureMap.Internal)getCommentAugmentationPointGroup()).getWrapper();
			case _0Package.COMMENT_TYPE__COMMENT_AUGMENTATION_POINT:
				return getCommentAugmentationPoint();
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
			case _0Package.COMMENT_TYPE__COMMENT_AUTHOR_TEXT:
				getCommentAuthorText().clear();
				getCommentAuthorText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.COMMENT_TYPE__COMMENT_CREATION_DATE:
				getCommentCreationDate().clear();
				getCommentCreationDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.COMMENT_TYPE__COMMENT_TEXT:
				getCommentText().clear();
				getCommentText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.COMMENT_TYPE__COMMENT_TITLE_TEXT:
				getCommentTitleText().clear();
				getCommentTitleText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.COMMENT_TYPE__COMMENT_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getCommentAugmentationPointGroup()).set(newValue);
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
			case _0Package.COMMENT_TYPE__COMMENT_AUTHOR_TEXT:
				getCommentAuthorText().clear();
				return;
			case _0Package.COMMENT_TYPE__COMMENT_CREATION_DATE:
				getCommentCreationDate().clear();
				return;
			case _0Package.COMMENT_TYPE__COMMENT_TEXT:
				getCommentText().clear();
				return;
			case _0Package.COMMENT_TYPE__COMMENT_TITLE_TEXT:
				getCommentTitleText().clear();
				return;
			case _0Package.COMMENT_TYPE__COMMENT_AUGMENTATION_POINT_GROUP:
				getCommentAugmentationPointGroup().clear();
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
			case _0Package.COMMENT_TYPE__COMMENT_AUTHOR_TEXT:
				return commentAuthorText != null && !commentAuthorText.isEmpty();
			case _0Package.COMMENT_TYPE__COMMENT_CREATION_DATE:
				return commentCreationDate != null && !commentCreationDate.isEmpty();
			case _0Package.COMMENT_TYPE__COMMENT_TEXT:
				return commentText != null && !commentText.isEmpty();
			case _0Package.COMMENT_TYPE__COMMENT_TITLE_TEXT:
				return commentTitleText != null && !commentTitleText.isEmpty();
			case _0Package.COMMENT_TYPE__COMMENT_AUGMENTATION_POINT_GROUP:
				return commentAugmentationPointGroup != null && !commentAugmentationPointGroup.isEmpty();
			case _0Package.COMMENT_TYPE__COMMENT_AUGMENTATION_POINT:
				return !getCommentAugmentationPoint().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (commentAugmentationPointGroup: ");
		result.append(commentAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //CommentTypeImpl
