import javax.faces.event.ActionEvent;

import model.service.AppModuleImpl;

import model.view.PopulateOrdersVORowImpl;

import model.view.SpOrderSetupVORowImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Number;

public class ManagedBean {
    private RichTable orderSetupTable;
    private RichTable learningCurveTable;

    public ManagedBean() {
    }
    AppModuleImpl appM = getAppModuleImpl();

    public AppModuleImpl getAppModuleImpl() {
        DCBindingContainer bindingContainer =
            (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        //BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContainer.findDataControl("AppModuleDataControl"); // Name of application module in datacontrolBinding.cpx
        AppModuleImpl appM = (AppModuleImpl)dc.getDataProvider();
        return appM;
    }


    public void populateOrdersDialogueListener(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome().name().equals("ok")) {
         //   System.out.println("dialogEvent.getOutcome().name().equals(\"ok\")" );
        
            populateOrders();
            
      
          AdfFacesContext.getCurrentInstance().addPartialTarget(this.getOrderSetupTable());
            AdfFacesContext.getCurrentInstance().addPartialTarget(this.getLearningCurveTable());
            
        } else if (dialogEvent.getOutcome().name().equals("cancel")) {
            ;
        }
    }

    private void populateOrders() {
        
        
        ViewObject pocOrdersVo = appM.getPopulateOrdersVO1();
        ViewObject  spOrderSetupVo = appM.getSpOrderSetupVO1();
        
          PopulateOrdersVORowImpl   pocOrdersRow = null;
           SpOrderSetupVORowImpl spOrderSetupRow = null; 
            
           String flag= null;

        Row rows[] =  pocOrdersVo.getAllRowsInRange();
        for (Row row : rows) {
            pocOrdersRow = (PopulateOrdersVORowImpl)row;
            
         //   System.out.println("=======  loop count  ====================");
            try {
                flag =   pocOrdersRow.getSelectOrder();
                
                if ( flag != null &&  flag.equals("y")) {
                    
                //   System.out.println(  "flag != null &&  flag.equals(\"y\")");
                    
                    spOrderSetupRow = (SpOrderSetupVORowImpl)spOrderSetupVo.createRow();
                
             //    spOrderSetupRow.setOrgId(   new Number (pocOrdersRow.getOrgId()));
                //   spOrderSetupRow.setOrgName(pocOrdersRow.getOrgName());
                //  spOrderSetupRow.setSystemId(pocOrdersRow.getSystemId());   
          
                    spOrderSetupRow.setBpoId(pocOrdersRow.getBpoId().toString());   
                    spOrderSetupRow.setBpo(pocOrdersRow.getBpo().toString()); 
                    spOrderSetupRow.setPocId(pocOrdersRow.getPocId());  
                    spOrderSetupRow.setBuyerName(pocOrdersRow.getBuyerName());
                    spOrderSetupRow.setSeason(pocOrdersRow.getSeason());
                    spOrderSetupRow.setStyle(pocOrdersRow.getStyle());
                    spOrderSetupRow.setColor(pocOrdersRow.getColor());
                    spOrderSetupRow.setWashName(pocOrdersRow.getWashName());
                    spOrderSetupRow.setLcUnit(pocOrdersRow.getLcUnit());
                    spOrderSetupRow.setLcUnitName(pocOrdersRow.getLcUnitName());
                    spOrderSetupRow.setProductionUnit(pocOrdersRow.getLcUnit());
                    spOrderSetupRow.setProductionUnitName(pocOrdersRow.getLcUnitName());
                    spOrderSetupRow.setProductionUnitShortName(pocOrdersRow.getLcUnitShortName());
                    spOrderSetupRow.setOrderQty(pocOrdersRow.getOrderQty());
                    spOrderSetupRow.setShipdate(pocOrdersRow.getShipdate()); 
                    spOrderSetupRow.setItemDescription(pocOrdersRow.getItemDescription());
                    spOrderSetupRow.setOrderType("Confirmed");
                    spOrderSetupRow.setProductivity(new Number(100));
                    
                    
                    spOrderSetupVo.insertRow(spOrderSetupRow);
                    
                 //  populateStyleWiseProcesses(pocOrdersRow.getSystemId() , spOrderSetupRow.getOrgId().toString() );
                
                //   populateProcesses(pocOrdersRow.getSectionId(),   new Number(pocOrdersRow.getOrgId())   );
                 populateLearningCurve();
                    
                    
                }
                    
            } catch (Exception e) {
               e.printStackTrace() ;
            }

        }
        
        
        
        
        
        
    }

    public void PopulateOtherOrder(ActionEvent actionEvent) {
        ViewObject otherOrderVo = appM.getSpProjBookingOrderVO1();
        Row otherOrderVoCurrentRow = otherOrderVo.getCurrentRow();
        // System.out.println(projectionStyleVoCurrentRow.getAttribute("Style"));

         
        ViewObject orderSetupVo = appM.getSpOrderSetupVO1();
        Row orderSetupVoRow ;
        orderSetupVoRow = orderSetupVo.getCurrentRow();

         //   System.out.println("! projectionStyleSystemId.equals(styleSetupSystemId) ");
        orderSetupVoRow = orderSetupVo.createRow();
        orderSetupVoRow.setAttribute("PocId",otherOrderVoCurrentRow.getAttribute("PocId")); 
        orderSetupVoRow.setAttribute("BpoId",otherOrderVoCurrentRow.getAttribute("BpoId")); 
        orderSetupVoRow.setAttribute("Bpo",otherOrderVoCurrentRow.getAttribute("Bpo")); 
        orderSetupVoRow.setAttribute("BuyerId",otherOrderVoCurrentRow.getAttribute("BuyerId")); 
        orderSetupVoRow.setAttribute("BuyerName",otherOrderVoCurrentRow.getAttribute("BuyerName"));
        orderSetupVoRow.setAttribute("Season",otherOrderVoCurrentRow.getAttribute("Season"));
        orderSetupVoRow.setAttribute("Style",otherOrderVoCurrentRow.getAttribute("Style"));
        orderSetupVoRow.setAttribute("Color",otherOrderVoCurrentRow.getAttribute("Color"));
        orderSetupVoRow.setAttribute("WashName",otherOrderVoCurrentRow.getAttribute("Wash"));
        orderSetupVoRow.setAttribute("LcUnit",otherOrderVoCurrentRow.getAttribute("LcUnit"));
        orderSetupVoRow.setAttribute("LcUnitName",otherOrderVoCurrentRow.getAttribute("LcUnitName"));
        orderSetupVoRow.setAttribute("ProductionUnit",otherOrderVoCurrentRow.getAttribute("LcUnit"));
        orderSetupVoRow.setAttribute("ProductionUnitName",otherOrderVoCurrentRow.getAttribute("LcUnitName"));
        orderSetupVoRow.setAttribute("ProductionUnitShortName",otherOrderVoCurrentRow.getAttribute("LcUnitShortName"));
        orderSetupVoRow.setAttribute("OrderQty",otherOrderVoCurrentRow.getAttribute("OrderQty"));  
        orderSetupVoRow.setAttribute("OrderType",otherOrderVoCurrentRow.getAttribute("OrderType"));
        orderSetupVoRow.setAttribute("Shipdate",otherOrderVoCurrentRow.getAttribute("Shipdate"));  

        orderSetupVo.insertRow(orderSetupVoRow);
        orderSetupVo.setCurrentRow(orderSetupVoRow);
    }

    public void updateOtherOrder(ActionEvent actionEvent) {
        // Add event code here...
        ViewObject otherOrderVo = appM.getSpProjBookingOrderVO1();
        Row otherOrderVoCurrentRow = otherOrderVo.getCurrentRow();
        // System.out.println(projectionStyleVoCurrentRow.getAttribute("Style"));

         
        ViewObject orderSetupVo = appM.getSpOrderSetupVO1();
        Row orderSetupVoRow ;
        orderSetupVoRow = orderSetupVo.getCurrentRow();
       
       // orderSetupVoRow.setAttribute("PocId",otherOrderVoCurrentRow.getAttribute("PocId")); 
      //  orderSetupVoRow.setAttribute("BpoId",otherOrderVoCurrentRow.getAttribute("BpoId")); 
        orderSetupVoRow.setAttribute("BuyerId",otherOrderVoCurrentRow.getAttribute("BuyerId")); 
        orderSetupVoRow.setAttribute("Bpo",otherOrderVoCurrentRow.getAttribute("Bpo")); 
        orderSetupVoRow.setAttribute("BuyerName",otherOrderVoCurrentRow.getAttribute("BuyerName"));
        orderSetupVoRow.setAttribute("Season",otherOrderVoCurrentRow.getAttribute("Season"));
        orderSetupVoRow.setAttribute("Style",otherOrderVoCurrentRow.getAttribute("Style"));
        orderSetupVoRow.setAttribute("Color",otherOrderVoCurrentRow.getAttribute("Color"));
        orderSetupVoRow.setAttribute("WashName",otherOrderVoCurrentRow.getAttribute("Wash"));
        orderSetupVoRow.setAttribute("LcUnit",otherOrderVoCurrentRow.getAttribute("LcUnit"));
        orderSetupVoRow.setAttribute("LcUnitName",otherOrderVoCurrentRow.getAttribute("LcUnitName"));
        orderSetupVoRow.setAttribute("ProductionUnit",otherOrderVoCurrentRow.getAttribute("LcUnit"));
        orderSetupVoRow.setAttribute("ProductionUnitName",otherOrderVoCurrentRow.getAttribute("LcUnitName"));
        orderSetupVoRow.setAttribute("ProductionUnitShortName",otherOrderVoCurrentRow.getAttribute("LcUnitShortName"));
        orderSetupVoRow.setAttribute("OrderQty",otherOrderVoCurrentRow.getAttribute("OrderQty"));  
        orderSetupVoRow.setAttribute("OrderType",otherOrderVoCurrentRow.getAttribute("OrderType"));
        orderSetupVoRow.setAttribute("Productivity",otherOrderVoCurrentRow.getAttribute("Productivity")); 
        orderSetupVoRow.setAttribute("Shipdate",otherOrderVoCurrentRow.getAttribute("Shipdate"));  
        
        
    }

    public void setOrderSetupTable(RichTable orderSetupTable) {
        this.orderSetupTable = orderSetupTable;
    }

    public RichTable getOrderSetupTable() {
        return orderSetupTable;
    }

    public void setLearningCurveTable(RichTable learningCurveTable) {
        this.learningCurveTable = learningCurveTable;
    }

    public RichTable getLearningCurveTable() {
        return learningCurveTable;
    }

    public void populateDefaultLearningDays(ActionEvent actionEvent) {
        // Add event code here...
        ViewObject ItemDescriptionVo  =  appM.getItemDescriptionVO1();
        RowSet defaultLearningCurveRs = (RowSet)ItemDescriptionVo.getCurrentRow().getAttribute("SpDefaultLearningCurveVO");
        int rowCount = defaultLearningCurveRs.getRowCount();
        
        ViewObject defaultLearningCurveVo = appM.getSpDefaultLearningCurveVO1();
        Row defaultLearningCurveVoRow = null;
        if(rowCount == 7){
            return ;
        }
        
        for (int i = rowCount+1; i <= 7;i++){
            defaultLearningCurveVoRow  =  defaultLearningCurveVo.createRow();
            defaultLearningCurveVoRow.setAttribute("DayNo", i);
            defaultLearningCurveVo.insertRow(defaultLearningCurveVoRow);
        }           
    }

    private void populateLearningCurve() {
        
        ViewObject orderSetupVo = appM.getSpOrderSetupVO1();
        ViewObject orderLearningCurveVo = appM.getSpOrderLearningCurveVO1();
        ViewObject defaultLearningCurveVo2 = appM.getSpDefaultLearningCurveVO2();
      //  defaultLearningCurveVo2.executeQuery();
       //System.out.println("=================  "+ orderSetupVo.getCurrentRow().getAttribute("Bpo"));
        
        RowSet rs = (RowSet)orderSetupVo.getCurrentRow().getAttribute("SpDefaultLearningCurveVO");
        
           // System.out.println(" =================="+ rs.getRowCount());
        
        Row learningCurveRow = null;
        Row[] defaultLearningCurveRows = rs.getAllRowsInRange();
        for(Row defaultLearningCurveRow : defaultLearningCurveRows ){
            learningCurveRow  = orderLearningCurveVo.createRow();
            learningCurveRow.setAttribute("DayNo", defaultLearningCurveRow.getAttribute("DayNo"));
            learningCurveRow.setAttribute("LearningPercentage", defaultLearningCurveRow.getAttribute("LearningPercentage"));
            orderLearningCurveVo.insertRow(learningCurveRow);
        }
        
        
            
    }
}
