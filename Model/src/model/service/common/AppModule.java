package model.service.common;

import oracle.jbo.ApplicationModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun May 22 12:26:28 BDT 2022
// ---------------------------------------------------------------------
public interface AppModule extends ApplicationModule {
    void setSessionValues(String orgId, String userId, String respId,
                          String respApplId);
}
