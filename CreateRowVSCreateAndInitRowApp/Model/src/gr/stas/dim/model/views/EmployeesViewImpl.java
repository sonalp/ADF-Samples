package gr.stas.dim.model.views;

import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Apr 08 11:44:41 EEST 2010
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class EmployeesViewImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public EmployeesViewImpl() {
    }

    /**
     * Returns the variable value for inEmpId.
     * @return variable value for inEmpId
     */
    public Number getinEmpId() {
        return (Number)ensureVariableManager().getVariableValue("inEmpId");
    }

    /**
     * Sets <code>value</code> for variable inEmpId.
     * @param value value to bind as inEmpId
     */
    public void setinEmpId(Number value) {
        ensureVariableManager().setVariableValue("inEmpId", value);
    }
}
