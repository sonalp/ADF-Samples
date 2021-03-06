package gr.dim.stas.model.module;

import gr.dim.stas.model.module.common.AppModule;


import gr.dim.stas.model.views.EmployeesViewImpl;

import oracle.jbo.Row;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Sep 05 13:12:13 EEST 2010
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleImpl extends ApplicationModuleImpl implements AppModule {
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleImpl() {
    }


    /**
     * Container's getter for EmployeesView1.
     * @return EmployeesView1
     */
    public EmployeesViewImpl getEmployeesView1() {
        return (EmployeesViewImpl)findViewObject("EmployeesView1");
    }


    /**
     * creates a new record in the Employees View Object.
     * Also executesEmptyRowSet in order not to fetch Data.
     */
    public void enterEmpsInInsertMode(){
     EmployeesViewImpl emps=this.getEmployeesView1();
     
     emps.executeEmptyRowSet(); // executeEmpty RowSet in order not to fetch Data.
     
     Row newRow=emps.createRow();
     
     emps.insertRow(newRow);
     
     emps.setCurrentRow(newRow);
        
    }
}
