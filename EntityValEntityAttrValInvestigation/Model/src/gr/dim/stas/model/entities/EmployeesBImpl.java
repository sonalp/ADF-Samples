package gr.dim.stas.model.entities;

import java.math.BigDecimal;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Nov 08 19:55:27 CET 2011
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class EmployeesBImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        EmployeeId {
            public Object get(EmployeesBImpl obj) {
                return obj.getEmployeeId();
            }

            public void put(EmployeesBImpl obj, Object value) {
                obj.setEmployeeId((Integer)value);
            }
        }
        ,
        FirstName {
            public Object get(EmployeesBImpl obj) {
                return obj.getFirstName();
            }

            public void put(EmployeesBImpl obj, Object value) {
                obj.setFirstName((String)value);
            }
        }
        ,
        LastName {
            public Object get(EmployeesBImpl obj) {
                return obj.getLastName();
            }

            public void put(EmployeesBImpl obj, Object value) {
                obj.setLastName((String)value);
            }
        }
        ,
        Email {
            public Object get(EmployeesBImpl obj) {
                return obj.getEmail();
            }

            public void put(EmployeesBImpl obj, Object value) {
                obj.setEmail((String)value);
            }
        }
        ,
        PhoneNumber {
            public Object get(EmployeesBImpl obj) {
                return obj.getPhoneNumber();
            }

            public void put(EmployeesBImpl obj, Object value) {
                obj.setPhoneNumber((String)value);
            }
        }
        ,
        HireDate {
            public Object get(EmployeesBImpl obj) {
                return obj.getHireDate();
            }

            public void put(EmployeesBImpl obj, Object value) {
                obj.setHireDate((Timestamp)value);
            }
        }
        ,
        JobId {
            public Object get(EmployeesBImpl obj) {
                return obj.getJobId();
            }

            public void put(EmployeesBImpl obj, Object value) {
                obj.setJobId((String)value);
            }
        }
        ,
        Salary {
            public Object get(EmployeesBImpl obj) {
                return obj.getSalary();
            }

            public void put(EmployeesBImpl obj, Object value) {
                obj.setSalary((BigDecimal)value);
            }
        }
        ,
        CommissionPct {
            public Object get(EmployeesBImpl obj) {
                return obj.getCommissionPct();
            }

            public void put(EmployeesBImpl obj, Object value) {
                obj.setCommissionPct((BigDecimal)value);
            }
        }
        ,
        ManagerId {
            public Object get(EmployeesBImpl obj) {
                return obj.getManagerId();
            }

            public void put(EmployeesBImpl obj, Object value) {
                obj.setManagerId((Integer)value);
            }
        }
        ,
        DepartmentId {
            public Object get(EmployeesBImpl obj) {
                return obj.getDepartmentId();
            }

            public void put(EmployeesBImpl obj, Object value) {
                obj.setDepartmentId((Integer)value);
            }
        }
        ,
        EmployeesB {
            public Object get(EmployeesBImpl obj) {
                return obj.getEmployeesB();
            }

            public void put(EmployeesBImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ManagerIdEmployeesB {
            public Object get(EmployeesBImpl obj) {
                return obj.getManagerIdEmployeesB();
            }

            public void put(EmployeesBImpl obj, Object value) {
                obj.setManagerIdEmployeesB((EmployeesBImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(EmployeesBImpl object);

        public abstract void put(EmployeesBImpl object, Object value);

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
    public static final int EMPLOYEEID = AttributesEnum.EmployeeId.index();
    public static final int FIRSTNAME = AttributesEnum.FirstName.index();
    public static final int LASTNAME = AttributesEnum.LastName.index();
    public static final int EMAIL = AttributesEnum.Email.index();
    public static final int PHONENUMBER = AttributesEnum.PhoneNumber.index();
    public static final int HIREDATE = AttributesEnum.HireDate.index();
    public static final int JOBID = AttributesEnum.JobId.index();
    public static final int SALARY = AttributesEnum.Salary.index();
    public static final int COMMISSIONPCT = AttributesEnum.CommissionPct.index();
    public static final int MANAGERID = AttributesEnum.ManagerId.index();
    public static final int DEPARTMENTID = AttributesEnum.DepartmentId.index();
    public static final int EMPLOYEESB = AttributesEnum.EmployeesB.index();
    public static final int MANAGERIDEMPLOYEESB = AttributesEnum.ManagerIdEmployeesB.index();

    /**
     * This is the default constructor (do not remove).
     */
    public EmployeesBImpl() {
    }

    /**
     * Gets the attribute value for EmployeeId, using the alias name EmployeeId.
     * @return the value of EmployeeId
     */
    public Integer getEmployeeId() {
        return (Integer)getAttributeInternal(EMPLOYEEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for EmployeeId.
     * @param value value to set the EmployeeId
     */
    public void setEmployeeId(Integer value) {
        setAttributeInternal(EMPLOYEEID, value);
    }

    /**
     * Gets the attribute value for FirstName, using the alias name FirstName.
     * @return the value of FirstName
     */
    public String getFirstName() {
        return (String)getAttributeInternal(FIRSTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for FirstName.
     * @param value value to set the FirstName
     */
    public void setFirstName(String value) {
        setAttributeInternal(FIRSTNAME, value);
    }

    /**
     * Gets the attribute value for LastName, using the alias name LastName.
     * @return the value of LastName
     */
    public String getLastName() {
        return (String)getAttributeInternal(LASTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastName.
     * @param value value to set the LastName
     */
    public void setLastName(String value) {
        setAttributeInternal(LASTNAME, value);
    }

    /**
     * Gets the attribute value for Email, using the alias name Email.
     * @return the value of Email
     */
    public String getEmail() {
        return (String)getAttributeInternal(EMAIL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Email.
     * @param value value to set the Email
     */
    public void setEmail(String value) {
        setAttributeInternal(EMAIL, value);
    }

    /**
     * Gets the attribute value for PhoneNumber, using the alias name PhoneNumber.
     * @return the value of PhoneNumber
     */
    public String getPhoneNumber() {
        return (String)getAttributeInternal(PHONENUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for PhoneNumber.
     * @param value value to set the PhoneNumber
     */
    public void setPhoneNumber(String value) {
        setAttributeInternal(PHONENUMBER, value);
    }

    /**
     * Gets the attribute value for HireDate, using the alias name HireDate.
     * @return the value of HireDate
     */
    public Timestamp getHireDate() {
        return (Timestamp)getAttributeInternal(HIREDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for HireDate.
     * @param value value to set the HireDate
     */
    public void setHireDate(Timestamp value) {
        setAttributeInternal(HIREDATE, value);
    }

    /**
     * Gets the attribute value for JobId, using the alias name JobId.
     * @return the value of JobId
     */
    public String getJobId() {
        return (String)getAttributeInternal(JOBID);
    }

    /**
     * Sets <code>value</code> as the attribute value for JobId.
     * @param value value to set the JobId
     */
    public void setJobId(String value) {
        setAttributeInternal(JOBID, value);
    }

    /**
     * Gets the attribute value for Salary, using the alias name Salary.
     * @return the value of Salary
     */
    public BigDecimal getSalary() {
        return (BigDecimal)getAttributeInternal(SALARY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Salary.
     * @param value value to set the Salary
     */
    public void setSalary(BigDecimal value) {
        setAttributeInternal(SALARY, value);
    }

    /**
     * Gets the attribute value for CommissionPct, using the alias name CommissionPct.
     * @return the value of CommissionPct
     */
    public BigDecimal getCommissionPct() {
        return (BigDecimal)getAttributeInternal(COMMISSIONPCT);
    }

    /**
     * Sets <code>value</code> as the attribute value for CommissionPct.
     * @param value value to set the CommissionPct
     */
    public void setCommissionPct(BigDecimal value) {
        setAttributeInternal(COMMISSIONPCT, value);
    }

    /**
     * Gets the attribute value for ManagerId, using the alias name ManagerId.
     * @return the value of ManagerId
     */
    public Integer getManagerId() {
        return (Integer)getAttributeInternal(MANAGERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ManagerId.
     * @param value value to set the ManagerId
     */
    public void setManagerId(Integer value) {
        setAttributeInternal(MANAGERID, value);
    }

    /**
     * Gets the attribute value for DepartmentId, using the alias name DepartmentId.
     * @return the value of DepartmentId
     */
    public Integer getDepartmentId() {
        return (Integer)getAttributeInternal(DEPARTMENTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DepartmentId.
     * @param value value to set the DepartmentId
     */
    public void setDepartmentId(Integer value) {
        setAttributeInternal(DEPARTMENTID, value);
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

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getEmployeesB() {
        return (RowIterator)getAttributeInternal(EMPLOYEESB);
    }

    /**
     * @return the associated entity EmployeesBImpl.
     */
    public EmployeesBImpl getManagerIdEmployeesB() {
        return (EmployeesBImpl)getAttributeInternal(MANAGERIDEMPLOYEESB);
    }

    /**
     * Sets <code>value</code> as the associated entity EmployeesBImpl.
     */
    public void setManagerIdEmployeesB(EmployeesBImpl value) {
        setAttributeInternal(MANAGERIDEMPLOYEESB, value);
    }

    /**
     * @param employeeId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer employeeId) {
        return new Key(new Object[]{employeeId});
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("gr.dim.stas.model.entities.EmployeesB");
    }

    /**
     * Check if there is at least one
     * Validation method for EmployeesB.
     * 
     */
    public boolean validateEmployeesB() {
        
        String firstName = getFirstName();
        String phonenumber = getPhoneNumber();
        
            //if the number is not null and this value is null, return false.
            if((phonenumber!=null && !phonenumber.trim().isEmpty()) && (firstName==null || firstName.trim().isEmpty()))
                return false;

            //if the number is not null and this value is null, return false.
            if((firstName!=null && !firstName.trim().isEmpty()) && (phonenumber==null || phonenumber.trim().isEmpty()))
                return false;

            return true;
        
    }

}
