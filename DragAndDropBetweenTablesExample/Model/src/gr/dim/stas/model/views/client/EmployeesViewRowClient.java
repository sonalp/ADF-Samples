package gr.dim.stas.model.views.client;

import gr.dim.stas.model.views.common.EmployeesViewRow;

import oracle.jbo.client.remote.RowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Nov 03 20:37:56 CET 2011
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class EmployeesViewRowClient extends RowImpl implements EmployeesViewRow {
    /**
     * This is the default constructor (do not remove).
     */
    public EmployeesViewRowClient() {
    }

    public void updateDepartmentId(Integer depId) {
        Object _ret =
            getApplicationModuleProxy().riInvokeExportedMethod(this,"updateDepartmentId",new String [] {"java.lang.Integer"},new Object[] {depId});
        return;
    }
}
