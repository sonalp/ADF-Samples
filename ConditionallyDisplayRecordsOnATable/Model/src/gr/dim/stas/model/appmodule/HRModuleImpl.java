package gr.dim.stas.model.appmodule;

import gr.dim.stas.model.appmodule.common.HRModule;

import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Nov 16 15:33:34 CET 2011
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class HRModuleImpl extends ApplicationModuleImpl implements HRModule {
    /**
     * This is the default constructor (do not remove).
     */
    public HRModuleImpl() {
    }

    /**
     * Container's getter for SampletableforcondView1.
     * @return SampletableforcondView1
     */
    public ViewObjectImpl getSampletableforcondView1() {
        return (ViewObjectImpl)findViewObject("SampletableforcondView1");
    }
    
    /**
     * check if the invoking row is with typeofdata.
     **/
    public Boolean isMasterFormC(Row row){
      //if, the type of this row is MasterFormC, then find all formC rows and make them required.
      System.out.println("typeofdata:   "+row.getAttribute("Typeofdata"));
      if("MasterFormC".equals((String)row.getAttribute("Typeofdata"))){
         return true;
      }
      return false;
    }
    
    /**
     * iterates over rows fetched from method called findByViewCriteria and sets the given value to ReqRadio attribute in each of those rows.
     * @param value
     * @return String, an Informational message that will store in a formatted way all the values of Rowname attribute of all rows.
     */
    public String updateOtherRows(String value){
      String warningMessage=null;
        ViewObjectImpl sampleTableView = getSampletableforcondView1();
        Row currentRow = sampleTableView.getCurrentRow();
        //only if we are from masterFormC
        if(isMasterFormC(currentRow)){
          //get The ViewCriteria
            RowIterator byViewCriteria =
                sampleTableView.findByViewCriteria(sampleTableView.getViewCriteria("SampletableforcondViewCriteria"), -1, sampleTableView.QUERY_MODE_SCAN_VIEW_ROWS);
            //if we have rows
            if(byViewCriteria.getFetchedRowCount()>0){
              warningMessage="The following rows, must have their RadioButtons selected:";
              while(byViewCriteria.hasNext()){
                  System.out.println(" found row..... setting value tor ReqRadion..."+ value);
                  Row row = byViewCriteria.next();
                  row.setAttribute("ReqRadio", value);
                  //change the message.
                
                   warningMessage= warningMessage + "<br> "+row.getAttribute("Rowname")+".</br>";
              }
            }
        }
      if(value==null)
          return null;
      
        return warningMessage;
    }
}
