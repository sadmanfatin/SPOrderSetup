package model.view;

import oracle.jbo.Row;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun May 22 11:07:18 BDT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SpOrderLearningCurveVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public SpOrderLearningCurveVOImpl() {
    }
    
    @Override
          public void insertRow(Row row) {
              Row lastRow = this.last();
              if (lastRow != null) {
                  //insert new row at the end and make it current
                  int indx = this.getRangeIndexOf(lastRow) + 1;
                  this.insertRowAtRangeIndex(indx, row);
              } else {
                  super.insertRow(row);
              }
          }
    
    
}
