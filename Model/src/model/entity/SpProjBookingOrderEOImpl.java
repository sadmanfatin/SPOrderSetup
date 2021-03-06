package model.entity;

import java.sql.SQLException;

import java.util.Map;

import oracle.adf.share.ADFContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon May 23 11:23:34 BDT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SpProjBookingOrderEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Color {
            public Object get(SpProjBookingOrderEOImpl obj) {
                return obj.getColor();
            }

            public void put(SpProjBookingOrderEOImpl obj, Object value) {
                obj.setColor((String)value);
            }
        }
        ,
        PocId {
            public Object get(SpProjBookingOrderEOImpl obj) {
                return obj.getPocId();
            }

            public void put(SpProjBookingOrderEOImpl obj, Object value) {
                obj.setPocId((Number)value);
            }
        }
        ,
        BpoId {
            public Object get(SpProjBookingOrderEOImpl obj) {
                return obj.getBpoId();
            }

            public void put(SpProjBookingOrderEOImpl obj, Object value) {
                obj.setBpoId((String)value);
            }
        }
        ,
        BuyerId {
            public Object get(SpProjBookingOrderEOImpl obj) {
                return obj.getBuyerId();
            }

            public void put(SpProjBookingOrderEOImpl obj, Object value) {
                obj.setBuyerId((Number)value);
            }
        }
        ,
        Style {
            public Object get(SpProjBookingOrderEOImpl obj) {
                return obj.getStyle();
            }

            public void put(SpProjBookingOrderEOImpl obj, Object value) {
                obj.setStyle((String)value);
            }
        }
        ,
        Season {
            public Object get(SpProjBookingOrderEOImpl obj) {
                return obj.getSeason();
            }

            public void put(SpProjBookingOrderEOImpl obj, Object value) {
                obj.setSeason((String)value);
            }
        }
        ,
        Wash {
            public Object get(SpProjBookingOrderEOImpl obj) {
                return obj.getWash();
            }

            public void put(SpProjBookingOrderEOImpl obj, Object value) {
                obj.setWash((String)value);
            }
        }
        ,
        OrgId {
            public Object get(SpProjBookingOrderEOImpl obj) {
                return obj.getOrgId();
            }

            public void put(SpProjBookingOrderEOImpl obj, Object value) {
                obj.setOrgId((Number)value);
            }
        }
        ,
        OrderQty {
            public Object get(SpProjBookingOrderEOImpl obj) {
                return obj.getOrderQty();
            }

            public void put(SpProjBookingOrderEOImpl obj, Object value) {
                obj.setOrderQty((Number)value);
            }
        }
        ,
        LcUnit {
            public Object get(SpProjBookingOrderEOImpl obj) {
                return obj.getLcUnit();
            }

            public void put(SpProjBookingOrderEOImpl obj, Object value) {
                obj.setLcUnit((Number)value);
            }
        }
        ,
        CreationDate {
            public Object get(SpProjBookingOrderEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(SpProjBookingOrderEOImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        CreatedBy {
            public Object get(SpProjBookingOrderEOImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(SpProjBookingOrderEOImpl obj, Object value) {
                obj.setCreatedBy((Number)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(SpProjBookingOrderEOImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(SpProjBookingOrderEOImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(SpProjBookingOrderEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(SpProjBookingOrderEOImpl obj, Object value) {
                obj.setLastUpdatedBy((Number)value);
            }
        }
        ,
        Bpo {
            public Object get(SpProjBookingOrderEOImpl obj) {
                return obj.getBpo();
            }

            public void put(SpProjBookingOrderEOImpl obj, Object value) {
                obj.setBpo((String)value);
            }
        }
        ,
        Shipdate {
            public Object get(SpProjBookingOrderEOImpl obj) {
                return obj.getShipdate();
            }

            public void put(SpProjBookingOrderEOImpl obj, Object value) {
                obj.setShipdate((Date)value);
            }
        }
        ,
        OrderType {
            public Object get(SpProjBookingOrderEOImpl obj) {
                return obj.getOrderType();
            }

            public void put(SpProjBookingOrderEOImpl obj, Object value) {
                obj.setOrderType((String)value);
            }
        }
        ,
        Productivity {
            public Object get(SpProjBookingOrderEOImpl obj) {
                return obj.getProductivity();
            }

            public void put(SpProjBookingOrderEOImpl obj, Object value) {
                obj.setProductivity((Number)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(SpProjBookingOrderEOImpl object);

        public abstract void put(SpProjBookingOrderEOImpl object,
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


    public static final int COLOR = AttributesEnum.Color.index();
    public static final int POCID = AttributesEnum.PocId.index();
    public static final int BPOID = AttributesEnum.BpoId.index();
    public static final int BUYERID = AttributesEnum.BuyerId.index();
    public static final int STYLE = AttributesEnum.Style.index();
    public static final int SEASON = AttributesEnum.Season.index();
    public static final int WASH = AttributesEnum.Wash.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int ORDERQTY = AttributesEnum.OrderQty.index();
    public static final int LCUNIT = AttributesEnum.LcUnit.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int BPO = AttributesEnum.Bpo.index();
    public static final int SHIPDATE = AttributesEnum.Shipdate.index();
    public static final int ORDERTYPE = AttributesEnum.OrderType.index();
    public static final int PRODUCTIVITY = AttributesEnum.Productivity.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SpProjBookingOrderEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("model.entity.SpProjBookingOrderEO");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for PocId, using the alias name PocId.
     * @return the PocId
     */
    public Number getPocId() {
        return (Number)getAttributeInternal(POCID);
    }

    /**
     * Sets <code>value</code> as the attribute value for PocId.
     * @param value value to set the PocId
     */
    public void setPocId(Number value) {
        setAttributeInternal(POCID, value);
    }

    /**
     * Gets the attribute value for BpoId, using the alias name BpoId.
     * @return the BpoId
     */
    public String getBpoId() {
        return (String)getAttributeInternal(BPOID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BpoId.
     * @param value value to set the BpoId
     */
    public void setBpoId(String value) {
        setAttributeInternal(BPOID, value);
    }

    /**
     * Gets the attribute value for BuyerId, using the alias name BuyerId.
     * @return the BuyerId
     */
    public Number getBuyerId() {
        return (Number)getAttributeInternal(BUYERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BuyerId.
     * @param value value to set the BuyerId
     */
    public void setBuyerId(Number value) {
        setAttributeInternal(BUYERID, value);
    }

    /**
     * Gets the attribute value for Style, using the alias name Style.
     * @return the Style
     */
    public String getStyle() {
        return (String)getAttributeInternal(STYLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Style.
     * @param value value to set the Style
     */
    public void setStyle(String value) {
        setAttributeInternal(STYLE, value);
    }

    /**
     * Gets the attribute value for Season, using the alias name Season.
     * @return the Season
     */
    public String getSeason() {
        return (String)getAttributeInternal(SEASON);
    }

    /**
     * Sets <code>value</code> as the attribute value for Season.
     * @param value value to set the Season
     */
    public void setSeason(String value) {
        setAttributeInternal(SEASON, value);
    }

    /**
     * Gets the attribute value for Color, using the alias name Color.
     * @return the Color
     */
    public String getColor() {
        return (String)getAttributeInternal(COLOR);
    }

    /**
     * Sets <code>value</code> as the attribute value for Color.
     * @param value value to set the Color
     */
    public void setColor(String value) {
        setAttributeInternal(COLOR, value);
    }

    /**
     * Gets the attribute value for Wash, using the alias name Wash.
     * @return the Wash
     */
    public String getWash() {
        return (String)getAttributeInternal(WASH);
    }

    /**
     * Sets <code>value</code> as the attribute value for Wash.
     * @param value value to set the Wash
     */
    public void setWash(String value) {
        setAttributeInternal(WASH, value);
    }

    /**
     * Gets the attribute value for OrgId, using the alias name OrgId.
     * @return the OrgId
     */
    public Number getOrgId() {
        return (Number)getAttributeInternal(ORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrgId.
     * @param value value to set the OrgId
     */
    public void setOrgId(Number value) {
        setAttributeInternal(ORGID, value);
    }

    /**
     * Gets the attribute value for OrderQty, using the alias name OrderQty.
     * @return the OrderQty
     */
    public Number getOrderQty() {
        return (Number)getAttributeInternal(ORDERQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrderQty.
     * @param value value to set the OrderQty
     */
    public void setOrderQty(Number value) {
        setAttributeInternal(ORDERQTY, value);
    }

    /**
     * Gets the attribute value for LcUnit, using the alias name LcUnit.
     * @return the LcUnit
     */
    public Number getLcUnit() {
        return (Number)getAttributeInternal(LCUNIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for LcUnit.
     * @param value value to set the LcUnit
     */
    public void setLcUnit(Number value) {
        setAttributeInternal(LCUNIT, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the CreationDate
     */
    public Date getCreationDate() {
        return (Date)getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreationDate.
     * @param value value to set the CreationDate
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the CreatedBy
     */
    public Number getCreatedBy() {
        return (Number)getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for LastUpdatedDate, using the alias name LastUpdatedDate.
     * @return the LastUpdatedDate
     */
    public Date getLastUpdatedDate() {
        return (Date)getAttributeInternal(LASTUPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedDate.
     * @param value value to set the LastUpdatedDate
     */
    public void setLastUpdatedDate(Date value) {
        setAttributeInternal(LASTUPDATEDDATE, value);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the LastUpdatedBy
     */
    public Number getLastUpdatedBy() {
        return (Number)getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for Bpo, using the alias name Bpo.
     * @return the Bpo
     */
    public String getBpo() {
        return (String)getAttributeInternal(BPO);
    }

    /**
     * Sets <code>value</code> as the attribute value for Bpo.
     * @param value value to set the Bpo
     */
    public void setBpo(String value) {
        setAttributeInternal(BPO, value);
    }

    /**
     * Gets the attribute value for Shipdate, using the alias name Shipdate.
     * @return the Shipdate
     */
    public Date getShipdate() {
        return (Date)getAttributeInternal(SHIPDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Shipdate.
     * @param value value to set the Shipdate
     */
    public void setShipdate(Date value) {
        setAttributeInternal(SHIPDATE, value);
    }

    /**
     * Gets the attribute value for OrderType, using the alias name OrderType.
     * @return the OrderType
     */
    public String getOrderType() {
        return (String)getAttributeInternal(ORDERTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrderType.
     * @param value value to set the OrderType
     */
    public void setOrderType(String value) {
        setAttributeInternal(ORDERTYPE, value);
    }

    /**
     * Gets the attribute value for Productivity, using the alias name Productivity.
     * @return the Productivity
     */
    public Number getProductivity() {
        return (Number)getAttributeInternal(PRODUCTIVITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Productivity.
     * @param value value to set the Productivity
     */
    public void setProductivity(Number value) {
        setAttributeInternal(PRODUCTIVITY, value);
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


    /**
     * @param bpoId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(String bpoId) {
        return new Key(new Object[]{bpoId});
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        Map sessionScope = ADFContext.getCurrent().getSessionScope();
        String orgId = (String)sessionScope.get("orgId");

        super.create(attributeList);

        oracle.jbo.server.SequenceImpl s =
            new oracle.jbo.server.SequenceImpl("SP_PROJ_BOOKING_ORDER_SEQ", getDBTransaction());
        oracle.jbo.domain.Number sVal = s.getSequenceNumber();
        String bpoId = "PB" + sVal.toString();

        this.setBpoId(bpoId);
        this.setPocId(new Number(0));
        try {

            this.setOrgId(new Number(orgId));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        this.setColor("TBA");
        this.setWash("TBA");
        this.setBpo("TBA");
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        super.doDML(operation, e);
    }
}
