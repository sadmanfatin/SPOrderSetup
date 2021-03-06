package model.view;

import model.entity.SpOrderSetupEOImpl;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun May 22 11:07:09 BDT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SpOrderSetupVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        OrderSetupId {
            public Object get(SpOrderSetupVORowImpl obj) {
                return obj.getOrderSetupId();
            }

            public void put(SpOrderSetupVORowImpl obj, Object value) {
                obj.setOrderSetupId((Number)value);
            }
        }
        ,
        LcUnit {
            public Object get(SpOrderSetupVORowImpl obj) {
                return obj.getLcUnit();
            }

            public void put(SpOrderSetupVORowImpl obj, Object value) {
                obj.setLcUnit((Number)value);
            }
        }
        ,
        LcUnitName {
            public Object get(SpOrderSetupVORowImpl obj) {
                return obj.getLcUnitName();
            }

            public void put(SpOrderSetupVORowImpl obj, Object value) {
                obj.setLcUnitName((String)value);
            }
        }
        ,
        PocId {
            public Object get(SpOrderSetupVORowImpl obj) {
                return obj.getPocId();
            }

            public void put(SpOrderSetupVORowImpl obj, Object value) {
                obj.setPocId((Number)value);
            }
        }
        ,
        OrderType {
            public Object get(SpOrderSetupVORowImpl obj) {
                return obj.getOrderType();
            }

            public void put(SpOrderSetupVORowImpl obj, Object value) {
                obj.setOrderType((String)value);
            }
        }
        ,
        ProductionUnit {
            public Object get(SpOrderSetupVORowImpl obj) {
                return obj.getProductionUnit();
            }

            public void put(SpOrderSetupVORowImpl obj, Object value) {
                obj.setProductionUnit((Number)value);
            }
        }
        ,
        ProductionUnitName {
            public Object get(SpOrderSetupVORowImpl obj) {
                return obj.getProductionUnitName();
            }

            public void put(SpOrderSetupVORowImpl obj, Object value) {
                obj.setProductionUnitName((String)value);
            }
        }
        ,
        ProductionUnitShortName {
            public Object get(SpOrderSetupVORowImpl obj) {
                return obj.getProductionUnitShortName();
            }

            public void put(SpOrderSetupVORowImpl obj, Object value) {
                obj.setProductionUnitShortName((String)value);
            }
        }
        ,
        Productivity {
            public Object get(SpOrderSetupVORowImpl obj) {
                return obj.getProductivity();
            }

            public void put(SpOrderSetupVORowImpl obj, Object value) {
                obj.setProductivity((Number)value);
            }
        }
        ,
        SewingStartDate {
            public Object get(SpOrderSetupVORowImpl obj) {
                return obj.getSewingStartDate();
            }

            public void put(SpOrderSetupVORowImpl obj, Object value) {
                obj.setSewingStartDate((Date)value);
            }
        }
        ,
        SewingEndDate {
            public Object get(SpOrderSetupVORowImpl obj) {
                return obj.getSewingEndDate();
            }

            public void put(SpOrderSetupVORowImpl obj, Object value) {
                obj.setSewingEndDate((Date)value);
            }
        }
        ,
        PbFlag {
            public Object get(SpOrderSetupVORowImpl obj) {
                return obj.getPbFlag();
            }

            public void put(SpOrderSetupVORowImpl obj, Object value) {
                obj.setPbFlag((String)value);
            }
        }
        ,
        OrgId {
            public Object get(SpOrderSetupVORowImpl obj) {
                return obj.getOrgId();
            }

            public void put(SpOrderSetupVORowImpl obj, Object value) {
                obj.setOrgId((Number)value);
            }
        }
        ,
        CreationDate {
            public Object get(SpOrderSetupVORowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(SpOrderSetupVORowImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        CreatedBy {
            public Object get(SpOrderSetupVORowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(SpOrderSetupVORowImpl obj, Object value) {
                obj.setCreatedBy((Number)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(SpOrderSetupVORowImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(SpOrderSetupVORowImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(SpOrderSetupVORowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(SpOrderSetupVORowImpl obj, Object value) {
                obj.setLastUpdatedBy((Number)value);
            }
        }
        ,
        OrderQty {
            public Object get(SpOrderSetupVORowImpl obj) {
                return obj.getOrderQty();
            }

            public void put(SpOrderSetupVORowImpl obj, Object value) {
                obj.setOrderQty((Number)value);
            }
        }
        ,
        Shipdate {
            public Object get(SpOrderSetupVORowImpl obj) {
                return obj.getShipdate();
            }

            public void put(SpOrderSetupVORowImpl obj, Object value) {
                obj.setShipdate((Date)value);
            }
        }
        ,
        BpoId {
            public Object get(SpOrderSetupVORowImpl obj) {
                return obj.getBpoId();
            }

            public void put(SpOrderSetupVORowImpl obj, Object value) {
                obj.setBpoId((String)value);
            }
        }
        ,
        ItemDescription {
            public Object get(SpOrderSetupVORowImpl obj) {
                return obj.getItemDescription();
            }

            public void put(SpOrderSetupVORowImpl obj, Object value) {
                obj.setItemDescription((String)value);
            }
        }
        ,
        Bpo {
            public Object get(SpOrderSetupVORowImpl obj) {
                return obj.getBpo();
            }

            public void put(SpOrderSetupVORowImpl obj, Object value) {
                obj.setBpo((String)value);
            }
        }
        ,
        BuyerId {
            public Object get(SpOrderSetupVORowImpl obj) {
                return obj.getBuyerId();
            }

            public void put(SpOrderSetupVORowImpl obj, Object value) {
                obj.setBuyerId((Number)value);
            }
        }
        ,
        BuyerName {
            public Object get(SpOrderSetupVORowImpl obj) {
                return obj.getBuyerName();
            }

            public void put(SpOrderSetupVORowImpl obj, Object value) {
                obj.setBuyerName((String)value);
            }
        }
        ,
        Season {
            public Object get(SpOrderSetupVORowImpl obj) {
                return obj.getSeason();
            }

            public void put(SpOrderSetupVORowImpl obj, Object value) {
                obj.setSeason((String)value);
            }
        }
        ,
        Style {
            public Object get(SpOrderSetupVORowImpl obj) {
                return obj.getStyle();
            }

            public void put(SpOrderSetupVORowImpl obj, Object value) {
                obj.setStyle((String)value);
            }
        }
        ,
        Color {
            public Object get(SpOrderSetupVORowImpl obj) {
                return obj.getColor();
            }

            public void put(SpOrderSetupVORowImpl obj, Object value) {
                obj.setColor((String)value);
            }
        }
        ,
        WashName {
            public Object get(SpOrderSetupVORowImpl obj) {
                return obj.getWashName();
            }

            public void put(SpOrderSetupVORowImpl obj, Object value) {
                obj.setWashName((String)value);
            }
        }
        ,
        CurrentShipdate {
            public Object get(SpOrderSetupVORowImpl obj) {
                return obj.getCurrentShipdate();
            }

            public void put(SpOrderSetupVORowImpl obj, Object value) {
                obj.setCurrentShipdate((Date)value);
            }
        }
        ,
        CurrentOrderQty {
            public Object get(SpOrderSetupVORowImpl obj) {
                return obj.getCurrentOrderQty();
            }

            public void put(SpOrderSetupVORowImpl obj, Object value) {
                obj.setCurrentOrderQty((Number)value);
            }
        }
        ,
        SpOrderLearningCurveVO {
            public Object get(SpOrderSetupVORowImpl obj) {
                return obj.getSpOrderLearningCurveVO();
            }

            public void put(SpOrderSetupVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        SpDefaultLearningCurveVO {
            public Object get(SpOrderSetupVORowImpl obj) {
                return obj.getSpDefaultLearningCurveVO();
            }

            public void put(SpOrderSetupVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        OrgLOV1 {
            public Object get(SpOrderSetupVORowImpl obj) {
                return obj.getOrgLOV1();
            }

            public void put(SpOrderSetupVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ProductionUnitLOV1 {
            public Object get(SpOrderSetupVORowImpl obj) {
                return obj.getProductionUnitLOV1();
            }

            public void put(SpOrderSetupVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(SpOrderSetupVORowImpl object);

        public abstract void put(SpOrderSetupVORowImpl object, Object value);

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


    public static final int ORDERSETUPID = AttributesEnum.OrderSetupId.index();
    public static final int LCUNIT = AttributesEnum.LcUnit.index();
    public static final int LCUNITNAME = AttributesEnum.LcUnitName.index();
    public static final int POCID = AttributesEnum.PocId.index();
    public static final int ORDERTYPE = AttributesEnum.OrderType.index();
    public static final int PRODUCTIONUNIT = AttributesEnum.ProductionUnit.index();
    public static final int PRODUCTIONUNITNAME = AttributesEnum.ProductionUnitName.index();
    public static final int PRODUCTIONUNITSHORTNAME = AttributesEnum.ProductionUnitShortName.index();
    public static final int PRODUCTIVITY = AttributesEnum.Productivity.index();
    public static final int SEWINGSTARTDATE = AttributesEnum.SewingStartDate.index();
    public static final int SEWINGENDDATE = AttributesEnum.SewingEndDate.index();
    public static final int PBFLAG = AttributesEnum.PbFlag.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int ORDERQTY = AttributesEnum.OrderQty.index();
    public static final int SHIPDATE = AttributesEnum.Shipdate.index();
    public static final int BPOID = AttributesEnum.BpoId.index();
    public static final int ITEMDESCRIPTION = AttributesEnum.ItemDescription.index();
    public static final int BPO = AttributesEnum.Bpo.index();
    public static final int BUYERID = AttributesEnum.BuyerId.index();
    public static final int BUYERNAME = AttributesEnum.BuyerName.index();
    public static final int SEASON = AttributesEnum.Season.index();
    public static final int STYLE = AttributesEnum.Style.index();
    public static final int COLOR = AttributesEnum.Color.index();
    public static final int WASHNAME = AttributesEnum.WashName.index();
    public static final int CURRENTSHIPDATE = AttributesEnum.CurrentShipdate.index();
    public static final int CURRENTORDERQTY = AttributesEnum.CurrentOrderQty.index();
    public static final int SPORDERLEARNINGCURVEVO = AttributesEnum.SpOrderLearningCurveVO.index();
    public static final int SPDEFAULTLEARNINGCURVEVO = AttributesEnum.SpDefaultLearningCurveVO.index();
    public static final int ORGLOV1 = AttributesEnum.OrgLOV1.index();
    public static final int PRODUCTIONUNITLOV1 = AttributesEnum.ProductionUnitLOV1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SpOrderSetupVORowImpl() {
    }

    /**
     * Gets SpOrderSetupEO entity object.
     * @return the SpOrderSetupEO
     */
    public SpOrderSetupEOImpl getSpOrderSetupEO() {
        return (SpOrderSetupEOImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for ORDER_SETUP_ID using the alias name OrderSetupId.
     * @return the ORDER_SETUP_ID
     */
    public Number getOrderSetupId() {
        return (Number) getAttributeInternal(ORDERSETUPID);
    }

    /**
     * Sets <code>value</code> as attribute value for ORDER_SETUP_ID using the alias name OrderSetupId.
     * @param value value to set the ORDER_SETUP_ID
     */
    public void setOrderSetupId(Number value) {
        setAttributeInternal(ORDERSETUPID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute LcUnit.
     * @return the LcUnit
     */
    public Number getLcUnit() {
        return (Number) getAttributeInternal(LCUNIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute LcUnit.
     * @param value value to set the  LcUnit
     */
    public void setLcUnit(Number value) {
        setAttributeInternal(LCUNIT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute LcUnitName.
     * @return the LcUnitName
     */
    public String getLcUnitName() {
        return (String) getAttributeInternal(LCUNITNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute LcUnitName.
     * @param value value to set the  LcUnitName
     */
    public void setLcUnitName(String value) {
        setAttributeInternal(LCUNITNAME, value);
    }

    /**
     * Gets the attribute value for BPO_ID using the alias name BpoId.
     * @return the BPO_ID
     */
    public String getBpoId() {
        return (String) getAttributeInternal(BPOID);
    }

    /**
     * Sets <code>value</code> as attribute value for BPO_ID using the alias name BpoId.
     * @param value value to set the BPO_ID
     */
    public void setBpoId(String value) {
        setAttributeInternal(BPOID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Bpo.
     * @return the Bpo
     */
    public String getBpo() {
        return (String) getAttributeInternal(BPO);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Bpo.
     * @param value value to set the  Bpo
     */
    public void setBpo(String value) {
        setAttributeInternal(BPO, value);
    }

    /**
     * Gets the attribute value for POC_ID using the alias name PocId.
     * @return the POC_ID
     */
    public Number getPocId() {
        return (Number) getAttributeInternal(POCID);
    }

    /**
     * Sets <code>value</code> as attribute value for POC_ID using the alias name PocId.
     * @param value value to set the POC_ID
     */
    public void setPocId(Number value) {
        setAttributeInternal(POCID, value);
    }


    /**
     * Gets the attribute value for ORDER_TYPE using the alias name OrderType.
     * @return the ORDER_TYPE
     */
    public String getOrderType() {
        return (String) getAttributeInternal(ORDERTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for ORDER_TYPE using the alias name OrderType.
     * @param value value to set the ORDER_TYPE
     */
    public void setOrderType(String value) {
        setAttributeInternal(ORDERTYPE, value);
    }

    /**
     * Gets the attribute value for PRODUCTION_UNIT using the alias name ProductionUnit.
     * @return the PRODUCTION_UNIT
     */
    public Number getProductionUnit() {
        return (Number) getAttributeInternal(PRODUCTIONUNIT);
    }

    /**
     * Sets <code>value</code> as attribute value for PRODUCTION_UNIT using the alias name ProductionUnit.
     * @param value value to set the PRODUCTION_UNIT
     */
    public void setProductionUnit(Number value) {
        setAttributeInternal(PRODUCTIONUNIT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ProductionUnitName.
     * @return the ProductionUnitName
     */
    public String getProductionUnitName() {
        return (String) getAttributeInternal(PRODUCTIONUNITNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ProductionUnitName.
     * @param value value to set the  ProductionUnitName
     */
    public void setProductionUnitName(String value) {
        setAttributeInternal(PRODUCTIONUNITNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ProductionUnitShortName.
     * @return the ProductionUnitShortName
     */
    public String getProductionUnitShortName() {
        return (String) getAttributeInternal(PRODUCTIONUNITSHORTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ProductionUnitShortName.
     * @param value value to set the  ProductionUnitShortName
     */
    public void setProductionUnitShortName(String value) {
        setAttributeInternal(PRODUCTIONUNITSHORTNAME, value);
    }

    /**
     * Gets the attribute value for PRODUCTIVITY using the alias name Productivity.
     * @return the PRODUCTIVITY
     */
    public Number getProductivity() {
        return (Number) getAttributeInternal(PRODUCTIVITY);
    }

    /**
     * Sets <code>value</code> as attribute value for PRODUCTIVITY using the alias name Productivity.
     * @param value value to set the PRODUCTIVITY
     */
    public void setProductivity(Number value) {
        setAttributeInternal(PRODUCTIVITY, value);
    }

    /**
     * Gets the attribute value for SEWING_START_DATE using the alias name SewingStartDate.
     * @return the SEWING_START_DATE
     */
    public Date getSewingStartDate() {
        return (Date) getAttributeInternal(SEWINGSTARTDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for SEWING_START_DATE using the alias name SewingStartDate.
     * @param value value to set the SEWING_START_DATE
     */
    public void setSewingStartDate(Date value) {
        setAttributeInternal(SEWINGSTARTDATE, value);
    }

    /**
     * Gets the attribute value for SEWING_END_DATE using the alias name SewingEndDate.
     * @return the SEWING_END_DATE
     */
    public Date getSewingEndDate() {
        return (Date) getAttributeInternal(SEWINGENDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for SEWING_END_DATE using the alias name SewingEndDate.
     * @param value value to set the SEWING_END_DATE
     */
    public void setSewingEndDate(Date value) {
        setAttributeInternal(SEWINGENDDATE, value);
    }

    /**
     * Gets the attribute value for PB_FLAG using the alias name PbFlag.
     * @return the PB_FLAG
     */
    public String getPbFlag() {
        return (String) getAttributeInternal(PBFLAG);
    }

    /**
     * Sets <code>value</code> as attribute value for PB_FLAG using the alias name PbFlag.
     * @param value value to set the PB_FLAG
     */
    public void setPbFlag(String value) {
        setAttributeInternal(PBFLAG, value);
    }

    /**
     * Gets the attribute value for ORG_ID using the alias name OrgId.
     * @return the ORG_ID
     */
    public Number getOrgId() {
        return (Number) getAttributeInternal(ORGID);
    }

    /**
     * Sets <code>value</code> as attribute value for ORG_ID using the alias name OrgId.
     * @param value value to set the ORG_ID
     */
    public void setOrgId(Number value) {
        setAttributeInternal(ORGID, value);
    }

    /**
     * Gets the attribute value for CREATION_DATE using the alias name CreationDate.
     * @return the CREATION_DATE
     */
    public Date getCreationDate() {
        return (Date) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATION_DATE using the alias name CreationDate.
     * @param value value to set the CREATION_DATE
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public Number getCreatedBy() {
        return (Number) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
     * @param value value to set the CREATED_BY
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_DATE using the alias name LastUpdatedDate.
     * @return the LAST_UPDATED_DATE
     */
    public Date getLastUpdatedDate() {
        return (Date) getAttributeInternal(LASTUPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_DATE using the alias name LastUpdatedDate.
     * @param value value to set the LAST_UPDATED_DATE
     */
    public void setLastUpdatedDate(Date value) {
        setAttributeInternal(LASTUPDATEDDATE, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @return the LAST_UPDATED_BY
     */
    public Number getLastUpdatedBy() {
        return (Number) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @param value value to set the LAST_UPDATED_BY
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }


    /**
     * Gets the attribute value for the calculated attribute BuyerId.
     * @return the BuyerId
     */
    public Number getBuyerId() {
        return (Number) getAttributeInternal(BUYERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BuyerId.
     * @param value value to set the  BuyerId
     */
    public void setBuyerId(Number value) {
        setAttributeInternal(BUYERID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BuyerName.
     * @return the BuyerName
     */
    public String getBuyerName() {
        return (String) getAttributeInternal(BUYERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BuyerName.
     * @param value value to set the  BuyerName
     */
    public void setBuyerName(String value) {
        setAttributeInternal(BUYERNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Season.
     * @return the Season
     */
    public String getSeason() {
        return (String) getAttributeInternal(SEASON);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Season.
     * @param value value to set the  Season
     */
    public void setSeason(String value) {
        setAttributeInternal(SEASON, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Style.
     * @return the Style
     */
    public String getStyle() {
        return (String) getAttributeInternal(STYLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Style.
     * @param value value to set the  Style
     */
    public void setStyle(String value) {
        setAttributeInternal(STYLE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Color.
     * @return the Color
     */
    public String getColor() {
        return (String) getAttributeInternal(COLOR);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Color.
     * @param value value to set the  Color
     */
    public void setColor(String value) {
        setAttributeInternal(COLOR, value);
    }

    /**
     * Gets the attribute value for the calculated attribute WashName.
     * @return the WashName
     */
    public String getWashName() {
        return (String) getAttributeInternal(WASHNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute WashName.
     * @param value value to set the  WashName
     */
    public void setWashName(String value) {
        setAttributeInternal(WASHNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CurrentShipdate.
     * @return the CurrentShipdate
     */
    public Date getCurrentShipdate() {
        return (Date) getAttributeInternal(CURRENTSHIPDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CurrentShipdate.
     * @param value value to set the  CurrentShipdate
     */
    public void setCurrentShipdate(Date value) {
        setAttributeInternal(CURRENTSHIPDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CurrentOrderQty.
     * @return the CurrentOrderQty
     */
    public Number getCurrentOrderQty() {
        return (Number) getAttributeInternal(CURRENTORDERQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CurrentOrderQty.
     * @param value value to set the  CurrentOrderQty
     */
    public void setCurrentOrderQty(Number value) {
        setAttributeInternal(CURRENTORDERQTY, value);
    }

    /**
     * Gets the attribute value for ITEM_DESCRIPTION using the alias name ItemDescription.
     * @return the ITEM_DESCRIPTION
     */
    public String getItemDescription() {
        return (String) getAttributeInternal(ITEMDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as attribute value for ITEM_DESCRIPTION using the alias name ItemDescription.
     * @param value value to set the ITEM_DESCRIPTION
     */
    public void setItemDescription(String value) {
        setAttributeInternal(ITEMDESCRIPTION, value);
    }

    /**
     * Gets the attribute value for ORDER_QTY using the alias name OrderQty.
     * @return the ORDER_QTY
     */
    public Number getOrderQty() {
        return (Number) getAttributeInternal(ORDERQTY);
    }

    /**
     * Sets <code>value</code> as attribute value for ORDER_QTY using the alias name OrderQty.
     * @param value value to set the ORDER_QTY
     */
    public void setOrderQty(Number value) {
        setAttributeInternal(ORDERQTY, value);
    }

    /**
     * Gets the attribute value for SHIPDATE using the alias name Shipdate.
     * @return the SHIPDATE
     */
    public Date getShipdate() {
        return (Date) getAttributeInternal(SHIPDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for SHIPDATE using the alias name Shipdate.
     * @param value value to set the SHIPDATE
     */
    public void setShipdate(Date value) {
        setAttributeInternal(SHIPDATE, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link SpOrderLearningCurveVO.
     */
    public RowIterator getSpOrderLearningCurveVO() {
        return (RowIterator)getAttributeInternal(SPORDERLEARNINGCURVEVO);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link SpDefaultLearningCurveVO.
     */
    public RowIterator getSpDefaultLearningCurveVO() {
        return (RowIterator)getAttributeInternal(SPDEFAULTLEARNINGCURVEVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> OrgLOV1.
     */
    public RowSet getOrgLOV1() {
        return (RowSet)getAttributeInternal(ORGLOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ProductionUnitLOV1.
     */
    public RowSet getProductionUnitLOV1() {
        return (RowSet)getAttributeInternal(PRODUCTIONUNITLOV1);
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
