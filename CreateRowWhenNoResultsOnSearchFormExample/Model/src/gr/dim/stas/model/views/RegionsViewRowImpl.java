package gr.dim.stas.model.views;

import oracle.jbo.AttributeDef;
import oracle.jbo.AttributeList;
import oracle.jbo.CriteriaClauses;
import oracle.jbo.Variable;
import oracle.jbo.ViewCriteria;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Nov 13 17:50:32 CET 2011
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class RegionsViewRowImpl extends ViewRowImpl {

    public static final int ENTITY_REGIONS = 0;

    protected void create(AttributeList attributeList) {
        System.out.println("creaaaaate::::::VeiwRowImpl");
        RegionsViewImpl rvI=(RegionsViewImpl)getViewObject();
        ViewCriteria criteria = rvI.getViewCriteria();
        if(criteria!=null){
        AttributeDef[] attributeDef = criteria.getUsedViewAttributes();
        Variable[] variables = rvI.getVariableManager().getVariables();
        for(AttributeDef attDef:attributeDef){
            int index=criteria.getAttributeIndexOf(attDef.getName());
            //ok we have the index.
            //now, get the variable with the same index.
            if(variables.length-1 >=index){
                Variable var=variables[index]; 
                System.out.println("setting "+attDef.getName()+" : "+rvI.getVariableManager().getVariableValue(var));
                attributeList.setAttribute(attDef.getName(), rvI.getVariableManager().getVariableValue(var));
            }
        }
        }

        super.create(attributeList);
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        RegionId {
            public Object get(RegionsViewRowImpl obj) {
                return obj.getRegionId();
            }

            public void put(RegionsViewRowImpl obj, Object value) {
                obj.setRegionId((Integer)value);
            }
        }
        ,
        RegionName {
            public Object get(RegionsViewRowImpl obj) {
                return obj.getRegionName();
            }

            public void put(RegionsViewRowImpl obj, Object value) {
                obj.setRegionName((String)value);
            }
        }
        ,
        IsNewRow {
            public Object get(RegionsViewRowImpl obj) {
                return obj.getIsNewRow();
            }

            public void put(RegionsViewRowImpl obj, Object value) {
                obj.setIsNewRow((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(RegionsViewRowImpl object);

        public abstract void put(RegionsViewRowImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }

    public static final int REGIONID = AttributesEnum.RegionId.index();
    public static final int REGIONNAME = AttributesEnum.RegionName.index();
    public static final int ISNEWROW = AttributesEnum.IsNewRow.index();

    /**
     * This is the default constructor (do not remove).
     */
    public RegionsViewRowImpl() {
    }

    /**
     * Gets Regions entity object.
     * @return the Regions
     */
    public EntityImpl getRegions() {
        return (EntityImpl)getEntity(ENTITY_REGIONS);
    }

    /**
     * Gets the attribute value for REGION_ID using the alias name RegionId.
     * @return the REGION_ID
     */
    public Integer getRegionId() {
        return (Integer) getAttributeInternal(REGIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for REGION_ID using the alias name RegionId.
     * @param value value to set the REGION_ID
     */
    public void setRegionId(Integer value) {
        setAttributeInternal(REGIONID, value);
    }

    /**
     * Gets the attribute value for REGION_NAME using the alias name RegionName.
     * @return the REGION_NAME
     */
    public String getRegionName() {
        return (String) getAttributeInternal(REGIONNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for REGION_NAME using the alias name RegionName.
     * @param value value to set the REGION_NAME
     */
    public void setRegionName(String value) {
        setAttributeInternal(REGIONNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute IsNewRow.
     * @return the IsNewRow
     */
    public String getIsNewRow() {
        
        return getEntity(0).getEntityState()==EntityImpl.STATUS_NEW ? "newRow" : "noNewRow";
//        return (String) getAttributeInternal(ISNEWROW);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute IsNewRow.
     * @param value value to set the  IsNewRow
     */
    public void setIsNewRow(String value) {
        setAttributeInternal(ISNEWROW, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}