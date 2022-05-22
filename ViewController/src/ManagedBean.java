import model.service.AppModuleImpl;

import model.view.PopulateOrdersVORowImpl;

import model.view.SpOrderSetupVORowImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.jbo.Row;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Number;

public class ManagedBean {
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
            
//         AdfFacesContext.getCurrentInstance().addPartialTarget(this.getStyleSetupTable());
//            AdfFacesContext.getCurrentInstance().addPartialTarget(this.getProcessSamTable());
            
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
                    
                 //  System.out.println(  "flag != null &&  flag.equals(\"y\")");
                    
                    spOrderSetupRow = (SpOrderSetupVORowImpl)spOrderSetupVo.createRow();
                
                 //    spOrderSetupRow.setOrgId(   new Number (pocOrdersRow.getOrgId()));
                 //   spOrderSetupRow.setOrgName(pocOrdersRow.getOrgName());
                  //  spOrderSetupRow.setSystemId(pocOrdersRow.getSystemId());   
                    spOrderSetupRow.setBuyerId(pocOrdersRow.getBuyerId());
                    spOrderSetupRow.setBuyerName(pocOrdersRow.getBuyerName());
                    spOrderSetupRow.setSeason(pocOrdersRow.getSeason());
                    spOrderSetupRow.setStyle(pocOrdersRow.getStyle());
                    spOrderSetupRow.setColor(pocOrdersRow.getColor());
                    spOrderSetupRow.setWashName(pocOrdersRow.getWashName());
                    spOrderSetupRow.setLcUnit(pocOrdersRow.getLcUnit());
                    spOrderSetupRow.setLcUnitName(pocOrdersRow.getLcUnitName());
                    spOrderSetupRow.setProductionUnit(pocOrdersRow.getProductionUnit());
                    spOrderSetupRow.setProductionUnitName(pocOrdersRow.getProductionUnitName());
                    spOrderSetupRow.setOrderQty(pocOrdersRow.getOrderQty());
             
                
                    

                    spOrderSetupVo.insertRow(spOrderSetupRow);
                    
                 //  populateStyleWiseProcesses(pocOrdersRow.getSystemId() , spOrderSetupRow.getOrgId().toString() );
                
                //   populateProcesses(pocOrdersRow.getSectionId(),   new Number(pocOrdersRow.getOrgId())   );
                }
                    
            } catch (Exception e) {
               e.printStackTrace() ;
            }

        }
        
        
        
        
        
        
    }
}
