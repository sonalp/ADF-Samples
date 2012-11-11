package gr.dim.stas.model.views;

import oracle.jbo.RowSet;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Nov 16 16:08:09 CET 2011
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SampletableforcondViewRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Rowname {
            public Object get(SampletableforcondViewRowImpl obj) {
                return obj.getRowname();
            }

            public void put(SampletableforcondViewRowImpl obj, Object value) {
                obj.setRowname((String)value);
            }
        }
        ,
        Id {
            public Object get(SampletableforcondViewRowImpl obj) {
                return obj.getId();
            }

            public void put(SampletableforcondViewRowImpl obj, Object value) {
                obj.setId((Number)value);
            }
        }
        ,
        Selectradio {
            public Object get(SampletableforcondViewRowImpl obj) {
                return obj.getSelectradio();
            }

            public void put(SampletableforcondViewRowImpl obj, Object value) {
                obj.setSelectradio((String)value);
            }
        }
        ,
        Comments {
            public Object get(SampletableforcondViewRowImpl obj) {
                return obj.getComments();
            }

            public void put(SampletableforcondViewRowImpl obj, Object value) {
                obj.setComments((String)value);
            }
        }
        ,
        Typeofdata {
            public Object get(SampletableforcondViewRowImpl obj) {
                return obj.getTypeofdata();
            }

            public void put(SampletableforcondViewRowImpl obj, Object value) {
                obj.setTypeofdata((String)value);
            }
        }
        ,
        ReqRadio {
            public Object get(SampletableforcondViewRowImpl obj) {
                return obj.getReqRadio();
            }

            public void put(SampletableforcondViewRowImpl obj, Object value) {
                obj.setReqRadio((String)value);
            }
        }
        ,
        IsVisible {
            public Object get(SampletableforcondViewRowImpl obj) {
                return obj.getIsVisible();
            }

            public void put(SampletableforcondViewRowImpl obj, Object value) {
                obj.setIsVisible((String)value);
            }
        }
        ,
        RadioChoices1 {
            public Object get(SampletableforcondViewRowImpl obj) {
                return obj.getRadioChoices1();
            }

            public void put(SampletableforcondViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(SampletableforcondViewRowImpl object);

        public abstract void put(SampletableforcondViewRowImpl object,
                                 Object value);

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
    public static final int ROWNAME = AttributesEnum.Rowname.index();
    public static final int ID = AttributesEnum.Id.index();
    public static final int SELECTRADIO = AttributesEnum.Selectradio.index();
    public static final int COMMENTS = AttributesEnum.Comments.index();
    public static final int TYPEOFDATA = AttributesEnum.Typeofdata.index();
    public static final int REQRADIO = AttributesEnum.ReqRadio.index();
    public static final int ISVISIBLE = AttributesEnum.IsVisible.index();
    public static final int RADIOCHOICES1 = AttributesEnum.RadioChoices1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SampletableforcondViewRowImpl() {
    }

    /**
     * Gets Sampletableforcond entity object.
     * @return the Sampletableforcond
     */
    public EntityImpl getSampletableforcond() {
        return (EntityImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for ROWNAME using the alias name Rowname.
     * @return the ROWNAME
     */
    public String getRowname() {
        return (String) getAttributeInternal(ROWNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for ROWNAME using the alias name Rowname.
     * @param value value to set the ROWNAME
     */
    public void setRowname(String value) {
        setAttributeInternal(ROWNAME, value);
    }

    /**
     * Gets the attribute value for ID using the alias name Id.
     * @return the ID
     */
    public Number getId() {
        return (Number) getAttributeInternal(ID);
    }

    /**
     * Sets <code>value</code> as attribute value for ID using the alias name Id.
     * @param value value to set the ID
     */
    public void setId(Number value) {
        setAttributeInternal(ID, value);
    }

    /**
     * Gets the attribute value for SELECTRADIO using the alias name Selectradio.
     * @return the SELECTRADIO
     */
    public String getSelectradio() {
        return (String) getAttributeInternal(SELECTRADIO);
    }

    /**
     * Sets <code>value</code> as attribute value for SELECTRADIO using the alias name Selectradio.
     * @param value value to set the SELECTRADIO
     */
    public void setSelectradio(String value) {
        setAttributeInternal(SELECTRADIO, value);
    }

    /**
     * Gets the attribute value for COMMENTS using the alias name Comments.
     * @return the COMMENTS
     */
    public String getComments() {
        return (String) getAttributeInternal(COMMENTS);
    }

    /**
     * Sets <code>value</code> as attribute value for COMMENTS using the alias name Comments.
     * @param value value to set the COMMENTS
     */
    public void setComments(String value) {
        setAttributeInternal(COMMENTS, value);
    }

    /**
     * Gets the attribute value for TYPEOFDATA using the alias name Typeofdata.
     * @return the TYPEOFDATA
     */
    public String getTypeofdata() {
        return (String) getAttributeInternal(TYPEOFDATA);
    }

    /**
     * Sets <code>value</code> as attribute value for TYPEOFDATA using the alias name Typeofdata.
     * @param value value to set the TYPEOFDATA
     */
    public void setTypeofdata(String value) {
        setAttributeInternal(TYPEOFDATA, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ReqRadio.
     * @return the ReqRadio
     */
    public String getReqRadio() {
        return (String) getAttributeInternal(REQRADIO);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ReqRadio.
     * @param value value to set the  ReqRadio
     */
    public void setReqRadio(String value) {
        setAttributeInternal(REQRADIO, value);
    }

    /**
     * Gets the attribute value for the calculated attribute IsVisible.
     * @return the IsVisible
     */
    public String getIsVisible() {
      if("formC".equals(getTypeofdata()) && getReqRadio()==null){
        return "false";
      }
        return "true";
//        return (String) getAttributeInternal(ISVISIBLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute IsVisible.
     * @param value value to set the  IsVisible
     */
    public void setIsVisible(String value) {
        setAttributeInternal(ISVISIBLE, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> RadioChoices1.
     */
    public RowSet getRadioChoices1() {
        return (RowSet)getAttributeInternal(RADIOCHOICES1);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
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
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}