package gr.stas.dim.model.views;

import gr.stas.dim.model.views.common.EmployeesView;

import oracle.jbo.server.ViewAttributeDefImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Mar 30 14:51:06 EEST 2010
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class EmployeesViewImpl extends ViewObjectImpl implements EmployeesView {
    /**
     * This is the default constructor (do not remove).
     */
    public EmployeesViewImpl() {
    }
    
    
    /**
     * Changes the value of the Queryable property of an Attribute of this ViewObject.
     * @param attrName String the name of the attribute.
     * @param isQueryable Boolean the value to be set.
     */
    public void changeQueryableProperty(String attrName, Boolean isQueryable){
        
        ViewAttributeDefImpl[] vAttrDefImpls=this.getViewAttributeDefImpls();
        int attrIndex=this.getAttributeIndexOf(attrName);
        vAttrDefImpls[attrIndex].setQueriable(isQueryable);
        
            
    }

    /**
     * Returns the variable value for inEmpId.
     * @return variable value for inEmpId
     */
    public String getinEmpId() {
        return (String)ensureVariableManager().getVariableValue("inEmpId");
    }

    /**
     * Sets <code>value</code> for variable inEmpId.
     * @param value value to bind as inEmpId
     */
    public void setinEmpId(String value) {
        ensureVariableManager().setVariableValue("inEmpId", value);
    }
}
