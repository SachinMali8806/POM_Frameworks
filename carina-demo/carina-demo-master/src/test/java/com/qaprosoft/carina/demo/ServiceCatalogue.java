/*
 * Copyright 2013-2018 QAPROSOFT (http://qaprosoft.com/).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.qaprosoft.carina.demo;

import java.util.List;

import com.qaprosoft.carina.core.foundation.utils.tag.Priority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestPriority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestTag;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.dataprovider.annotations.XlsDataSourceParameters;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;

import com.qaprosoft.carina.demo.gui.components.ManagementMenu;

import com.qaprosoft.carina.demo.gui.components.NotificationMenu;

import com.qaprosoft.carina.demo.gui.pages.ConfirmationReceivedPage;
import com.qaprosoft.carina.demo.gui.pages.DashboardPage;
import com.qaprosoft.carina.demo.gui.pages.EntityContactInformationPage;
import com.qaprosoft.carina.demo.gui.pages.FeesListPage;

import com.qaprosoft.carina.demo.gui.pages.LoginPage;
import com.qaprosoft.carina.demo.gui.pages.ModelInfoPage;
import com.qaprosoft.carina.demo.gui.pages.NewEntityPage;
import com.qaprosoft.carina.demo.gui.pages.NewFeePage;
import com.qaprosoft.carina.demo.gui.pages.NewServiceGroup;
import com.qaprosoft.carina.demo.gui.pages.NewServicePage;

import com.qaprosoft.carina.demo.gui.pages.PendingForApproverPage;
import com.qaprosoft.carina.demo.gui.pages.ServiceListPage;

/**
 * This sample shows how create Web test.
 * 
 * @author qpsdemo
 */
public class ServiceCatalogue extends AbstractTest  {
	
    @Test(dataProvider = "SingleDataProvider", description = "JIRA#AUTO-0008" ,priority=1)
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestTag(name = "area test", value = "data provider")
    @TestTag(name = "specialization", value = "xlsx")
    @XlsDataSourceParameters(path = "xls/demo.xlsx", sheet = "New_Service", dsUid = "TUID", dsArgs = "User_Name,Password,Service_FMIS_Code, Service_Name_EN, Printable_Description_EN, Service_Type,Start_Date_Time, Notes,Service_Owner,Service_Name_AR,Printable_Description_AR,Service_Category,End_Date_Time,Price_Type,Price_Amount,Percent,Amount_Per_Unit,Min_Amount,Max_Amount,Share_Type,Amount,Share_Percentage,Share_Rule_Type,Share_Entity,Revenue_Account_Reference,Settlement_Account_Type,VAT,Add_Fee")
    public void createService(String UserName,String Password,String Service_FMIS_Code, String Service_Name_EN, String Printable_Description_EN, String Service_Type, String Start_Date_Time, String Notes,String Service_Owner, String Service_Name_AR,String Printable_Description_AR,String Service_Category,String End_Date_Time,String Price_Type,String Price_Amount,String Percent,String Amount_Per_Unit,String Min_Amount,String Max_Amount,String Share_Type,String Amount,String Share_Percentage,String Share_Rule_Type,String Share_Entity,String Revenue_Account_Reference,String Settlement_Account_Type,String VAT,String Add_Fee) {
        // Open GSM Arena home page and verify page is opened
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open(); 
        Assert.assertTrue(loginPage.isLoginBTNPresent(),"Login Page is not Opened");        
        loginPage.typeUserName(UserName);
        loginPage.typePassWord(Password);
       
        DashboardPage dashboard = loginPage.clickOnLogin();
        
        Assert.assertTrue(dashboard.isDashboardDisplayed(), "Dashboard Page Not Displayed");
             
         ManagementMenu entityManage = dashboard.clickOnServiceManagement();
        
         Assert.assertTrue(entityManage.isNewServiceDisplayed(), "New Service tab  Not Displayed");
                                        
          NewServicePage newServicePage = entityManage.clickOnNewService();
         
          Assert.assertTrue(newServicePage.serviceDetailsDisplayed(), "Service Details  Not Displayed");
          
		  newServicePage.typeFMISCode(Service_FMIS_Code);
         
          newServicePage.selectServiceFMISCode(Service_FMIS_Code);
         
          newServicePage.typeServiceNameEN(Service_Name_EN);
         
          newServicePage.typePrintableDescriptionEN(Printable_Description_EN);
        
          newServicePage.typeServiceType(Service_Type);
         
          newServicePage.clickOnSelectDateAndTime();
          
          //newServicePage.clickOnSelectNextDate();
         
          //newServicePage.clickOnIncrementHour();
          
          newServicePage.clickOnIncrementMinute();
          
          
          newServicePage.clickOnOkBTN2();
         
          newServicePage.typeNotes(Notes);  
         
          newServicePage.typeServiceOwner(Service_Owner);
          
          newServicePage.typeServiceNameAR(Service_Name_AR);
         
          newServicePage.typePrintableDescriptionAR(Printable_Description_AR);
         
          newServicePage.clickOnSelectCategory(Service_Category);
          
          newServicePage.selectPriceType(Price_Type);
          
          newServicePage.typePercent(Percent);
          
          newServicePage.typeAmountPerUnit(Amount_Per_Unit);
          
          newServicePage.typeMinAmount(Min_Amount);
          
          newServicePage.typeMaxAmount(Max_Amount);
          
          newServicePage.typePriceAmount(Price_Amount);
          
          newServicePage.selectShareType(Share_Type);
          
          newServicePage.typeAmount(Amount);
          
          newServicePage.typeSharePercentage(Share_Percentage);
          
          newServicePage.selectShareRuleType(Share_Rule_Type);
          
          newServicePage.selectAnyShareEntity(Share_Entity);
          
          newServicePage.SelectAnyRevAccReference(Revenue_Account_Reference);
          
          newServicePage.clickOnAnySelAccType(Settlement_Account_Type);
                    
          newServicePage.SelectVAT(VAT);
          
          newServicePage.clickOnAddFee(Add_Fee);
          
          
          
//          if (!Add_Fee.contains("")) {
//        	  
//        	 
//			
//		}
//          
          
                           
          newServicePage.clickOnSaveService();
         
          newServicePage.getSuccMessageAfterSave();
        
          newServicePage.clickOnOkAfterSaveService();
          
          newServicePage.clickOnEntireRow();
        
          newServicePage.clickOnCheckBox();
          
          newServicePage.clickOnSubmitForApproval();
          
          newServicePage.getMssgSubmitforApproval();
          
          newServicePage.clickOnOkAfterSubmitforApproval();
          
          getDriver().navigate().refresh();
          
          getDriver().navigate().refresh();
          
          NotificationMenu notifictnMenu = dashboard.clickOnNotificationIcon();
          
          PendingForApproverPage pendingForApproval = notifictnMenu.clickOnNotification();
          
          pendingForApproval.clickOnCheckBoxClick();
          
          pendingForApproval.clickOnSubmitReviewResul();
        
        
        
    }
    
    
    
    @Test(dataProvider = "SingleDataProvider", description = "JIRA#AUTO-0008" ,priority=2)
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestTag(name = "area test", value = "data provider")
    @TestTag(name = "specialization", value = "xlsx")
    @XlsDataSourceParameters(path = "xls/demo.xlsx", sheet = "New_Service_Group", dsUid = "TUID", dsArgs = "User_Name,Password,Service_Group_Name_EN,  Printable_Description_EN, Service_Group_Activation_Start_Date,Service_Group_Name_AR, Printable_Description_AR,Service_Group_Activation_End_Date ,Max_Num_of_Services,Notes,Assign_Service1,Assign_Service2,Assign_Service3")
    public void createServiceGroup(String UserName,String Password,String Service_Group_Name_EN, String Printable_Description_EN, String Service_Group_Activation_Start_Date, String Service_Group_Name_AR, String Printable_Description_AR,String Service_Group_Activation_End_Date, String Max_Num_of_Services,String Notes,String Assign_Service1,String Assign_Service2,String Assign_Service3) {
        // Open GSM Arena home page and verify page is opened
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open(); 
        Assert.assertTrue(loginPage.isLoginBTNPresent(),"Login Page is not Opened");        
        loginPage.typeUserName(UserName);
        loginPage.typePassWord(Password);
       
        DashboardPage dashboard = loginPage.clickOnLogin();
        
        Assert.assertTrue(dashboard.isDashboardDisplayed(), "Dashboard Page Not Displayed");
             
         ManagementMenu serviceManage = dashboard.clickOnServiceManagement();
        
         
                                        
           NewServiceGroup newServiceGRoupPage = serviceManage.clickOnNewServiceGroup();
         
    Assert.assertTrue(newServiceGRoupPage.serviceGroupDetailsDisplayed(),"New Service Group details is not displayed ");
          
          newServiceGRoupPage.typeServiceGroupNameEN(Service_Group_Name_EN);
         
          newServiceGRoupPage.typePrintableDescriptionEN(Printable_Description_EN);
                 
          newServiceGRoupPage.clickOnSelectDateAndTime();
          
          //newServicePage.clickOnSelectNextDate();
         
          //newServicePage.clickOnIncrementHour();
          
          newServiceGRoupPage.clickOnIncrementMinute();
          
          
          newServiceGRoupPage.clickOnOkBTN2();
          
          newServiceGRoupPage.typeServiceGroupNameAR(Service_Group_Name_AR);
          
          newServiceGRoupPage.typePrintableDescriptionAR(Printable_Description_AR);
          
          newServiceGRoupPage.selectService(Assign_Service1);
          
          newServiceGRoupPage.selectService(Assign_Service2);
          
          newServiceGRoupPage.selectService(Assign_Service3);
         
        
                          
          newServiceGRoupPage.clickOnSaveServiceGroup();
          
          newServiceGRoupPage.clickOnOkAfterSaveService();
                  
          newServiceGRoupPage.clickOnEntireRow();
        
          newServiceGRoupPage.clickOnCheckBox();
          
          newServiceGRoupPage.clickOnSubmitForApproval();
          
          newServiceGRoupPage.getMssgSubmitforApproval();
          
          newServiceGRoupPage.clickOnOkAfterSubmitforApproval();
          
          getDriver().navigate().refresh();
          
          getDriver().navigate().refresh();
          
          NotificationMenu notifictnMenu = dashboard.clickOnNotificationIcon();
          
          PendingForApproverPage pendingForApproval = notifictnMenu.clickOnNotification();
          
          pendingForApproval.clickOnCheckBoxClick();
          
          pendingForApproval.clickOnSubmitReviewResul();
        
        
        
    }
    
    @Test(dataProvider = "SingleDataProvider", description = "JIRA#AUTO-0008" ,priority=2)
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestTag(name = "area test", value = "data provider")
    @TestTag(name = "specialization", value = "xlsx")
    @XlsDataSourceParameters(path = "xls/demo.xlsx", sheet = "Modify_Service_Group", dsUid = "TUID", dsArgs = "User_Name,Password,Service_Group_Name_EN, New_Service_Group_Name_EN,   Printable_Description_EN, Service_Group_Activation_Start_Date,Service_Group_Name_AR, Printable_Description_AR,Service_Group_Activation_End_Date ,Max_Num_of_Services,Notes,Assign_Service1,Assign_Service2,Assign_Service3")
    public void modifyServiceGroup(String UserName,String Password,String Service_Group_Name_EN, String New_Service_Group_Name_EN,   String Printable_Description_EN, String Service_Group_Activation_Start_Date, String Service_Group_Name_AR, String Printable_Description_AR,String Service_Group_Activation_End_Date, String Max_Num_of_Services,String Notes,String Assign_Service1,String Assign_Service2,String Assign_Service3) {
        // Open GSM Arena home page and verify page is opened
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open(); 
        Assert.assertTrue(loginPage.isLoginBTNPresent(),"Login Page is not Opened");        
        loginPage.typeUserName(UserName);
        loginPage.typePassWord(Password);
       
        DashboardPage dashboard = loginPage.clickOnLogin();
        
        Assert.assertTrue(dashboard.isDashboardDisplayed(), "Dashboard Page Not Displayed");
             
         ManagementMenu entityManage = dashboard.clickOnServiceManagement();
        
         
                                        
         ServiceListPage serviceListPage = entityManage.clickOnServiceList();
         
        
         serviceListPage.clickOnServiceGroupTab();
         
         serviceListPage.typeEntrGroupNameOrCode(Service_Group_Name_EN);
         
         serviceListPage.clickOnAutoSuggItem();
        
         serviceListPage.clickOnEntireRowForModify();
         
          NewServiceGroup modifyServiceGroup = serviceListPage.clickOnModifyIcon1();
         
         
          
          if( !New_Service_Group_Name_EN.equals(""))
          {
        	  modifyServiceGroup.typeServiceGroupNameEN(New_Service_Group_Name_EN);
          }
         
         if( !Printable_Description_EN.equals(""))
         {
        	 modifyServiceGroup.typePrintableDescriptionEN(Printable_Description_EN);
          
         }
        	 modifyServiceGroup.clickOnSelectDateAndTime();
             
             modifyServiceGroup.selectUpdateDateBTN(); 
        	 
        	 
        	 
        	 
         if(!Service_Group_Name_AR.equals(""))
         {
        	 modifyServiceGroup.typeServiceGroupNameAR(Service_Group_Name_AR);
         }
         if( !Printable_Description_AR.equals(""))
         {
        	 modifyServiceGroup.typePrintableDescriptionAR(Printable_Description_AR);
         }
         
         if( !Assign_Service1.equals(""))
         {
        	 modifyServiceGroup.clickOnDeleteIcon();
        	 
        	 modifyServiceGroup.selectService(Assign_Service1);
         }
         
         if( !Assign_Service2.equals(""))
         {
        	 modifyServiceGroup.selectService(Assign_Service2);
         }
        
         if( !Assign_Service3.equals(""))
         {
        	 modifyServiceGroup.selectService(Assign_Service3);
         }
        
         modifyServiceGroup.clickOnSaveServiceGroup();
         
         
         modifyServiceGroup.clickOnOkAfterSaveService();
         
         modifyServiceGroup.clickOnEntireRow();
         
           
         modifyServiceGroup.clickOnCheckBox();
         
         modifyServiceGroup.clickOnSubmitForApproval();
         
         
         //serviceListPage.getMssgSubmitforApproval();
         
         modifyServiceGroup.clickOnOkAfterSubmitforApproval();
         
         getDriver().navigate().refresh();
         
         getDriver().navigate().refresh();
         
         getDriver().navigate().refresh();
         
         NotificationMenu notifictnMenu = dashboard.clickOnNotificationIcon();
         
         PendingForApproverPage pendingForApproval = notifictnMenu.clickOnNotification();
         
         
         
         pendingForApproval.clickOnCheckBoxClick();
         
         pendingForApproval.clickOnSubmitReviewResul();
         
         pendingForApproval.getMssgAfterSubmitforApproval();
         
         
         ConfirmationReceivedPage confirmatnReceived = pendingForApproval.clickOnOKBTN();
         
         confirmatnReceived.getGroupDetails();
         
         
         
          //newServicePage.clickOnSelectNextDate();
         
        
        
    }
    
    @Test(dataProvider = "SingleDataProvider", description = "JIRA#AUTO-008" ,priority=0)
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestTag(name = "area test", value = "data provider")
    @TestTag(name = "specialization", value = "xlsx")
    @XlsDataSourceParameters(path = "xls/demo.xlsx", sheet = "Deactivate_Service_Group", dsUid = "TUID", dsArgs = "User_Name,Password, Service_Group_Name_EN")
    public void deactivateServiceGroup(String UserName,String Password,String Service_Group_Name_EN) {
        // Open GSM Arena home page and verify page is opened
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open(); 
        Assert.assertTrue(loginPage.isLoginBTNPresent(),"Login Page is not Opened");        
        loginPage.typeUserName(UserName);
        loginPage.typePassWord(Password);
       
        DashboardPage dashboard = loginPage.clickOnLogin();
        
        Assert.assertTrue(dashboard.isDashboardDisplayed(), "Dashboard Page Not Displayed");
             
         ManagementMenu entityManage = dashboard.clickOnServiceManagement();
        
         Assert.assertTrue(entityManage.isServiceListDisplayed(), "Service List tab  Not Displayed");
                                        
          ServiceListPage serviceListPage = entityManage.clickOnServiceList();
          
          serviceListPage.clickOnServiceGroupTab();
          
          serviceListPage.typeEntrGroupNameOrCode(Service_Group_Name_EN);
          
          serviceListPage.clickOnAutoSuggItem();
         
          serviceListPage.clickOnEntireRow();
         
          serviceListPage.clickOnDeactivateIcon();
        
          serviceListPage.clickOnDeactivateServiceGroupBTN();
          
          serviceListPage.clickOnSelectDate();
         
          serviceListPage.clickOnDeactivateServiceDate();
          
          serviceListPage.clickOnDeactivateBTN();
          
          serviceListPage.clickOnOkBTN();
          
          //newServicePage.clickOnSelectNextDate();
         
          getDriver().navigate().refresh();
          
          getDriver().navigate().refresh();
          
          getDriver().navigate().refresh();
        
          NotificationMenu notifictnMenu = dashboard.clickOnNotificationIcon();
          
          PendingForApproverPage pendingForApproval = notifictnMenu.clickOnNotification();
          
          pendingForApproval.clickOnCheckBoxClick();
          
          pendingForApproval.clickOnSubmitReviewResul();
        
          ConfirmationReceivedPage confirmatnReceived = pendingForApproval.clickOnOKBTN();
          
          confirmatnReceived.getGroupDetails();
          
        
        
    }
    
    
    @Test(dataProvider = "SingleDataProvider", description = "JIRA#AUTO-0008" ,priority=3)
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestTag(name = "area test", value = "data provider")
    @TestTag(name = "specialization", value = "xlsx")
    @XlsDataSourceParameters(path = "xls/demo.xlsx", sheet = "Reactivate_Service_Group", dsUid = "TUID", dsArgs = "User_Name,Password, Service_Group_Name_EN")
    public void reactivateServiceGroup(String UserName,String Password,String Service_Group_Name_EN) {
        // Open GSM Arena home page and verify page is opened
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open(); 
        Assert.assertTrue(loginPage.isLoginBTNPresent(),"Login Page is not Opened");        
        loginPage.typeUserName(UserName);
        loginPage.typePassWord(Password);
       
        DashboardPage dashboard = loginPage.clickOnLogin();
        
        Assert.assertTrue(dashboard.isDashboardDisplayed(), "Dashboard Page Not Displayed");
             
         ManagementMenu entityManage = dashboard.clickOnServiceManagement();
        
         Assert.assertTrue(entityManage.isServiceListDisplayed(), "Service List tab  Not Displayed");
                                        
          ServiceListPage serviceListPage = entityManage.clickOnServiceList();
          
          Assert.assertTrue(serviceListPage.isServceAndServiceGrp(), "Services and Service Groups Not Displayed");
          
          serviceListPage.clickOnInactiveTab();
          
          serviceListPage.clickOnServiceGroupTab();
          
          serviceListPage.typeEntrServiceCodeOrName(Service_Group_Name_EN);
         
          serviceListPage.clickOnAutoSuggItem();
         
          serviceListPage.clickOnEntireRow();
         
          serviceListPage.clickOnReactivateBTN();
                   
          serviceListPage.clearGroupEndDate();
          
          serviceListPage.clickOnSelectDateAndTime();
          
          serviceListPage.selectReactivateDateBTN();
               
          serviceListPage.clickOnSaveServiceGroup();
          
          serviceListPage.successfullMessageForReactivateService();
          
          serviceListPage.clickOnOkBTN();
          
          getDriver().navigate().refresh();
          getDriver().navigate().refresh();
         
          
          
          serviceListPage.clickOnInprogressTab();
          
          serviceListPage.clickOnServiceGroupTab();
          
          serviceListPage.typeEntrGroupNameOrCode(Service_Group_Name_EN);
          
          serviceListPage.clickOnAutoSuggItem();
          
          serviceListPage.clickOnRowForApproval();
          
          serviceListPage.clickOnCheckBox();
          
          serviceListPage.clickOnSubmitForApproval();
          
          serviceListPage.clickOnOkBTN();
          
          getDriver().navigate().refresh();
          getDriver().navigate().refresh();
          getDriver().navigate().refresh();
          
          
                   
          NotificationMenu notifictnMenu = dashboard.clickOnNotificationIcon();
          
          PendingForApproverPage pendingForApproval = notifictnMenu.clickOnNotification();
          
          pendingForApproval.clickOnCheckBoxClick();
          
          pendingForApproval.clickOnSubmitReviewResul();
          
        ConfirmationReceivedPage confirmatnReceived = pendingForApproval.clickOnOKBTN();
        
        confirmatnReceived.getGroupDetails();
          
          
          
        
        
        
    }
    
    
    
   
    @Test(dataProvider = "SingleDataProvider", description = "JIRA#AUTO-0008" ,priority=2)
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestTag(name = "area test", value = "data provider")
    @TestTag(name = "specialization", value = "xlsx")
    @XlsDataSourceParameters(path = "xls/demo.xlsx", sheet = "Modify_Services", dsUid = "TUID", dsArgs = "User_Name,Password,Service_FMIS_Code, Service_Name_EN,  Start_Date_Time, Notes,End_Date_Time,Share_Type,Amount,Share_Percentage,Share_Rule_Type,Share_Entity,Revenue_Account_Reference,Settlement_Account_Type,VAT")
    public void modifyService(String UserName,String Password,String Service_FMIS_Code, String Service_Name_EN,  String Start_Date_Time, String Notes,String End_Date_Time,String Share_Type,String Amount,String Share_Percentage,String Share_Rule_Type,String Share_Entity,String Revenue_Account_Reference,String Settlement_Account_Type,String VAT) {
        // Open GSM Arena home page and verify page is opened
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open(); 
        Assert.assertTrue(loginPage.isLoginBTNPresent(),"Login Page is not Opened");        
        loginPage.typeUserName(UserName);
        loginPage.typePassWord(Password);
       
        DashboardPage dashboard = loginPage.clickOnLogin();
        
        Assert.assertTrue(dashboard.isDashboardDisplayed(), "Dashboard Page Not Displayed");
             
         ManagementMenu entityManage = dashboard.clickOnServiceManagement();
        
         Assert.assertTrue(entityManage.isNewServiceDisplayed(), "New Service tab  Not Displayed");
                                        
         ServiceListPage serviceListPage = entityManage.clickOnServiceList();
         
         Assert.assertTrue(serviceListPage.isServceAndServiceGrp(), "Services and Service Groups Not Displayed");
         
         serviceListPage.typeEntrServiceCodeOrName(Service_Name_EN);
         
         serviceListPage.clickOnAutoSuggItem();
        
         serviceListPage.clickOnEntireRowForModify();
         
         NewServicePage modifyService = serviceListPage.clickOnModifyIcon();
         
         modifyService.clickOnSelectDateAndTime();
         
         modifyService.selectUpdateDateBTN();
         
         if( !Notes.equals(""))
         {
        	 modifyService.typeNotes(Notes);
         }
          
         if( !Share_Type.equals(""))
         {
        	 modifyService.selectShareType(Share_Type);
         }
         
         if(!Amount.equals(""))
         {
        	 modifyService.typeAmount(Amount);
         }
         if( !Share_Percentage.equals(""))
         {
        	 modifyService.typeSharePercentage(Share_Percentage);
         }
         if( !Share_Rule_Type.equals(""))
         {
        	 modifyService.selectShareRuleType(Share_Rule_Type);
         }
         if( !Share_Entity.equals(""))
         {
        	 modifyService.selectAnyShareEntity(Share_Entity);
         }
         
         if( !Revenue_Account_Reference.equals(""))
         {
        	 modifyService.SelectAnyRevAccReference(Revenue_Account_Reference);
         }
         if(!Settlement_Account_Type.equals(""))
         {
        	 modifyService.clickOnAnySelAccType(Settlement_Account_Type);
         }
         if(!VAT.equals(""))
         {
        	 modifyService.SelectVAT(VAT);
         }
         modifyService.clickOnSaveService();
         
         
         modifyService.clickOnOkAfterSaveService();
         
         modifyService.clickOnEntireRow();
         
           
         modifyService.clickOnCheckBox();
         
         modifyService.clickOnSubmitForApproval();
         
         
         //serviceListPage.getMssgSubmitforApproval();
         
         modifyService.clickOnOkAfterSubmitforApproval();
         
         getDriver().navigate().refresh();
         
         getDriver().navigate().refresh();
         
         getDriver().navigate().refresh();
         
         NotificationMenu notifictnMenu = dashboard.clickOnNotificationIcon();
         
         PendingForApproverPage pendingForApproval = notifictnMenu.clickOnNotification();
         
         
         
         pendingForApproval.clickOnCheckBoxClick();
         
         pendingForApproval.clickOnSubmitReviewResul();
         
         pendingForApproval.getMssgAfterSubmitforApproval();
         
         
         ConfirmationReceivedPage confirmatnReceived = pendingForApproval.clickOnOKBTN();
         
         confirmatnReceived.getFeeDetails();
         
         
         
          //newServicePage.clickOnSelectNextDate();
         
        
        
    }
    
    @Test(dataProvider = "SingleDataProvider", description = "JIRA#AUTO-008" ,priority=3)
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestTag(name = "area test", value = "data provider")
    @TestTag(name = "specialization", value = "xlsx")
    @XlsDataSourceParameters(path = "xls/demo.xlsx", sheet = "Deactivate_Services", dsUid = "TUID", dsArgs = "User_Name,Password, Service_Name_EN")
    public void deactivateService(String UserName,String Password,String Service_Name_EN) {
        // Open GSM Arena home page and verify page is opened
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open(); 
        Assert.assertTrue(loginPage.isLoginBTNPresent(),"Login Page is not Opened");        
        loginPage.typeUserName(UserName);
        loginPage.typePassWord(Password);
       
        DashboardPage dashboard = loginPage.clickOnLogin();
        
        Assert.assertTrue(dashboard.isDashboardDisplayed(), "Dashboard Page Not Displayed");
             
         ManagementMenu entityManage = dashboard.clickOnServiceManagement();
        
         Assert.assertTrue(entityManage.isServiceListDisplayed(), "Service List tab  Not Displayed");
                                        
          ServiceListPage serviceListPage = entityManage.clickOnServiceList();
          
          Assert.assertTrue(serviceListPage.isServceAndServiceGrp(), "Services and Service Groups Not Displayed");
          
          serviceListPage.typeEntrServiceCodeOrName(Service_Name_EN);
         
          serviceListPage.clickOnAutoSuggItem();
         
          serviceListPage.clickOnEntireRow();
         
          serviceListPage.clickOnDeactivateIcon();
        
          serviceListPage.clickOnDeactivateServiceBTN();
          
          serviceListPage.clickOnSelectDate();
         
          serviceListPage.clickOnDeactivateServiceDate();
          
          serviceListPage.clickOnDeactivateBTN();
          
          //newServicePage.clickOnSelectNextDate();
         
          getDriver().navigate().refresh();
          
          getDriver().navigate().refresh();
          
          getDriver().navigate().refresh();
        
          NotificationMenu notifictnMenu = dashboard.clickOnNotificationIcon();
          
          PendingForApproverPage pendingForApproval = notifictnMenu.clickOnNotification();
          
          pendingForApproval.clickOnCheckBoxClick();
          
          pendingForApproval.clickOnSubmitReviewResul();
        
        
        
    }
    
    @Test(dataProvider = "SingleDataProvider", description = "JIRA#AUTO-0008" ,priority=3)
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestTag(name = "area test", value = "data provider")
    @TestTag(name = "specialization", value = "xlsx")
    @XlsDataSourceParameters(path = "xls/demo.xlsx", sheet = "Reactivate_Services", dsUid = "TUID", dsArgs = "User_Name,Password, Service_Name_EN")
    public void reactivateService(String UserName,String Password,String Service_Name_EN) {
        // Open GSM Arena home page and verify page is opened
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open(); 
        Assert.assertTrue(loginPage.isLoginBTNPresent(),"Login Page is not Opened");        
        loginPage.typeUserName(UserName);
        loginPage.typePassWord(Password);
       
        DashboardPage dashboard = loginPage.clickOnLogin();
        
        Assert.assertTrue(dashboard.isDashboardDisplayed(), "Dashboard Page Not Displayed");
             
         ManagementMenu entityManage = dashboard.clickOnServiceManagement();
        
         Assert.assertTrue(entityManage.isServiceListDisplayed(), "Service List tab  Not Displayed");
                                        
          ServiceListPage serviceListPage = entityManage.clickOnServiceList();
          
          Assert.assertTrue(serviceListPage.isServceAndServiceGrp(), "Services and Service Groups Not Displayed");
          
          serviceListPage.clickOnInactiveTab();
          
          serviceListPage.typeEntrServiceCodeOrName(Service_Name_EN);
         
          serviceListPage.clickOnAutoSuggItem();
         
          serviceListPage.clickOnEntireRow();
         
          serviceListPage.clickOnReactivateBTN();
          
          serviceListPage.clickOnSelectDateAndTime();
          
          serviceListPage.selectReactivateDateBTN();
        
          serviceListPage.clearEndDate();
          
          serviceListPage.clickOnSaveService();
          
          serviceListPage.successfullMessageForReactivateService();
          
          serviceListPage.clickOnOkBTN();
          
          getDriver().navigate().refresh();
          getDriver().navigate().refresh();
          getDriver().navigate().refresh();
          
          
          serviceListPage.clickOnInprogressTab();
          
          serviceListPage.typeEntrServiceCodeOrName(Service_Name_EN);
          
          serviceListPage.clickOnAutoSuggItem();
          
          serviceListPage.clickOnRowForApproval();
          
          serviceListPage.clickOnCheckBox();
          
          serviceListPage.clickOnSubmitForApproval();
          
          serviceListPage.clickOnOkBTN();
          
          getDriver().navigate().refresh();
          getDriver().navigate().refresh();
          getDriver().navigate().refresh();
          
          
                   
          NotificationMenu notifictnMenu = dashboard.clickOnNotificationIcon();
          
          PendingForApproverPage pendingForApproval = notifictnMenu.clickOnNotification();
          
          pendingForApproval.clickOnCheckBoxClick();
          
          pendingForApproval.clickOnSubmitReviewResul();
          
        ConfirmationReceivedPage confirmatnReceived = pendingForApproval.clickOnOKBTN();
        
        confirmatnReceived.reactivateServiceDetails();
          
          
          
        
        
        
    }
    
    
    @Test(dataProvider = "SingleDataProvider", description = "JIRA#AUTO-0008",priority=3)
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestTag(name = "area test", value = "data provider")
    @TestTag(name = "specialization", value = "xlsx")
    @XlsDataSourceParameters(path = "xls/demo.xlsx", sheet = "New_Fee", dsUid = "TUID", dsArgs = "User_Name, Password, Fee_FMIS_Code,Fee_Name_EN, Printable_Description_EN, Fee_Activation_Start_Date ,Notes,Fee_Type,Fee_Name_AR,Printable_Description_AR,Fee_Calculation_Type,Fee_Amount,Percent,Unit_Value,Min_Amount,Max_Amount,Share_Type,Amount,Share_Percentage,Share_Rule_Type,Share_Entity,Revenue_Account_Reference,Settlement_Account_Type,VAT")
    public void createFee(String User_Name, String Password, String Fee_FMIS_Code, String Fee_Name_EN, String Printable_Description_EN, String Fee_Activation_Start_Date, String Notes,String Fee_Type,String Fee_Name_AR,String Printable_Description_AR,String Fee_Calculation_Type,String Fee_Amount,String Percent,String Unit_Value,String Min_Amount,String Max_Amount,String Share_Type,String Amount,String Share_Percentage,String Share_Rule_Type,String Share_Entity,String Revenue_Account_Reference,String Settlement_Account_Type,String VAT) throws Exception {
        // Open GSM Arena home page and verify page is opened
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();
      
        Assert.assertTrue(loginPage.isLoginBTNPresent(), "Service Catalogue Portal Login Page is Not Displayed");
        loginPage.typeUserName(User_Name);
        loginPage.typePassWord(Password);
       
        DashboardPage dashboard = loginPage.clickOnLogin();
        
        Assert.assertTrue(dashboard.isDashboardDisplayed(),"Dashboard Page is Not Displayed");
             
         ManagementMenu feeManage = dashboard.clickOnFeeManagement();
         
         Assert.assertTrue(feeManage.isNewFeeDisplayed(), "New Fee Field is not Visible");
                                
           NewFeePage newFeePage = feeManage.clickOnNewFee();
           
        Assert.assertTrue(newFeePage.isFeeDetailsPageDisplayed(), "New Fee Field is not Visible");    
         
           newFeePage.typeAnyFeeFMISCode(Fee_FMIS_Code);
         
           newFeePage.typeFeeNameEN(Fee_Name_EN);
         
           newFeePage.typePrintableDescriptionEN(Printable_Description_EN);
        
           newFeePage.clickOnSelectDateAndTime();
           
           //newFeePage.clickOnIncrementHour();
           
           newFeePage.clickOnIncrementMinute();
         
           newFeePage.clickOnOkBTN2();
          
          //newServicePage.clickOnSelectTodaysDate();
         
           newFeePage.typeNotes(Notes);
          
           newFeePage.selectFeeType(Fee_Type);
          
           newFeePage.typeFeeNameAR(Fee_Name_AR);
         
           newFeePage.typePrintableDescriptionAR(Printable_Description_AR);
           
           newFeePage.selectFeeCalculanType(Fee_Calculation_Type);
           
           if (newFeePage.isFeeAmountVisible()) {
        	   
        	   newFeePage.typeFeeAmount(Fee_Amount);
			
		}
         
         if (newFeePage.isPercentVisible()) {
        	   
	           newFeePage.typePercent(Percent);
			
		}
           
         if (newFeePage.isUnitValueVisible()) {
      	   
        	 newFeePage.typeUnitValue(Unit_Value);
			
		} 
           
         
         if (newFeePage.isMinAmountVisible()) {
      	   
        	 newFeePage.typeMinAmount(Min_Amount);
			
		} 
           
         if (newFeePage.isMaxAmountVisible()) {
        	   
        	 newFeePage.typeMaxAmount(Max_Amount);
			
		}  
         
         if (newFeePage.isShareTypeClickable()) {
      	   
        	 newFeePage.selectShareType(Share_Type);
			
		}  
         
         if (newFeePage.isSharePercentageVisible()) {
        	   
        	 newFeePage.typeSharePercentage(Share_Percentage);
			
		}  
           
           
         if (newFeePage.isAmountVisible()) {
      	   
        	 newFeePage.typeAmount(Amount);
			
		}                      
          
           
    
           
           newFeePage.selectShareRuleType(Share_Rule_Type);
           
           newFeePage.selectAnyShareEntity(Share_Entity);
           
           newFeePage.SelectAnyRevAccReference(Revenue_Account_Reference);
           
           newFeePage.clickOnAnySelAccType(Settlement_Account_Type);
           
           newFeePage.SelectVAT(VAT); 
           
           newFeePage.clickOnSaveFee();
          
           newFeePage.getFeeSuccMsg();
           
           newFeePage.clickOnOkBTN1();
           
           newFeePage.clickOnEntireRow();
           
           newFeePage.clickOnCheckBox();
           
           Assert.assertTrue(newFeePage.isSubmitForApprovalDisplayed(),"Submit for Approval Button not Displayed ");
           
           newFeePage.clickOnSubmitForApproval();
           
           newFeePage.clickOnOkBTN1();
           
           getDriver().navigate().refresh();
           
           Assert.assertTrue(dashboard.isNotificationIconDisplayed(),"Notification Icon not Displayed ");
           
           NotificationMenu notifictnMenu = dashboard.clickOnNotificationIcon();
           
           PendingForApproverPage pendingForApproval = notifictnMenu.clickOnNotification();
           
           pendingForApproval.clickOnCheckBoxClick();
           
           Assert.assertTrue(pendingForApproval.isSubmitReviewResulDisplayed(),"Submit Review Result Button not Displayed ");
           
           pendingForApproval.clickOnSubmitReviewResul();
           
           Assert.assertTrue(dashboard.isLogOutBTNVisible(),"Logout Button is Not Visible ");
           
           dashboard.clickOnLogOut();
           
           
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    @Test(dataProvider = "SingleDataProvider", description = "JIRA#AUTO-0008" ,priority=4)
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestTag(name = "area test", value = "data provider")
    @TestTag(name = "specialization", value = "xlsx")
    @XlsDataSourceParameters(path = "xls/demo.xlsx", sheet = "Modify_Fee", dsUid = "TUID", dsArgs = "User_Name,Password,Fee_Name_EN, Fee_Activation_Start_Date , Notes,Share_Type,Amount,Share_Percentage,Share_Rule_Type,Share_Entity,Revenue_Account_Reference,Settlement_Account_Type,VAT")
    public void modifyFee(String UserName,String Password,String Fee_Name_EN, String Fee_Activation_Start_Date,  String Notes, String Share_Type,String Amount,String Share_Percentage,String Share_Rule_Type,String Share_Entity,String Revenue_Account_Reference,String Settlement_Account_Type,String VAT) {
        // Open GSM Arena home page and verify page is opened
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open(); 
        Assert.assertTrue(loginPage.isLoginBTNPresent(),"Login Page is not Opened");        
        loginPage.typeUserName(UserName);
        loginPage.typePassWord(Password);
       
        DashboardPage dashboard = loginPage.clickOnLogin();
        
        Assert.assertTrue(dashboard.isDashboardDisplayed(), "Dashboard Page Not Displayed");
             
         ManagementMenu feeManage = dashboard.clickOnFeeManagement();
        
         Assert.assertTrue(feeManage.isFeesListDisplayed(), "Fee List is not Visible");
                                        
         FeesListPage feeListPage = feeManage.clickOnFeesList();
         
         
        
         feeListPage.typeEntrFeeCodeOrName(Fee_Name_EN);
         
         feeListPage.clickOnAutoSuggItem();
        
         feeListPage.clickOnEntireRow();
         
          NewFeePage modifyFee = feeListPage.clickOnModifyIcon();
          
          modifyFee.clickOnSelectDateAndTime();
         
          modifyFee.selectUpdateDateBTN();
          
         
         if( !Notes.equals(""))
         {
        	 modifyFee.typeNotes(Notes);
         }
          
         if( !Share_Type.equals(""))
         {
        	 modifyFee.selectShareType(Share_Type);
         }
         
         if(!Amount.equals(""))
         {
        	 modifyFee.typeFeeAmount(Amount);
         }
         if( !Share_Percentage.equals(""))
         {
        	 modifyFee.typeSharePercentage(Share_Percentage);
         }
         if( !Share_Rule_Type.equals(""))
         {
        	 modifyFee.selectShareRuleType(Share_Rule_Type);
         }
         if( !Share_Entity.equals(""))
         {
        	 modifyFee.selectAnyShareEntity(Share_Entity);
         }
         
         if( !Revenue_Account_Reference.equals(""))
         {
        	 modifyFee.SelectAnyRevAccReference(Revenue_Account_Reference);
         }
         if(!Settlement_Account_Type.equals(""))
         {
        	 modifyFee.clickOnAnySelAccType(Settlement_Account_Type);
         }
         if(!VAT.equals(""))
         {
        	 modifyFee.SelectVAT(VAT);
         }
         modifyFee.clickOnSaveFee();
         
         modifyFee.clickOnOkBTN1();
         
         modifyFee.clickOnEntireRow();
         
         modifyFee.clickOnCheckBox();
         
         modifyFee.clickOnSubmitForApproval();
         
         
         
         modifyFee.clickOnOkBTN1();
         
         getDriver().navigate().refresh();
         
         getDriver().navigate().refresh();
         
         getDriver().navigate().refresh();
         
         
         NotificationMenu notifictnMenu = dashboard.clickOnNotificationIcon();
         
         PendingForApproverPage pendingForApproval = notifictnMenu.clickOnNotification();
         
         
         
         pendingForApproval.clickOnCheckBoxClick();
         
         pendingForApproval.clickOnSubmitReviewResul();
         
         pendingForApproval.getMssgAfterSubmitforApproval();
         
         ConfirmationReceivedPage confirmatnReceived = pendingForApproval.clickOnOKBTN();
         
         confirmatnReceived.getFeeDetails();
         
         
         
         
         
         
         
          //newServicePage.clickOnSelectNextDate();
         
        
        
    }

    @Test(dataProvider = "SingleDataProvider", description = "JIRA#AUTO-0008",priority=4)
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestTag(name = "area test", value = "data provider")
    @TestTag(name = "specialization", value = "xlsx")
    @XlsDataSourceParameters(path = "xls/demo.xlsx", sheet = "Deactivate_Fees", dsUid = "TUID", dsArgs = "User_Name, Password,Fee_Name_EN")
    public void deactivateFee(String User_Name, String Password, String Fee_Name_EN) throws Exception {
        // Open GSM Arena home page and verify page is opened
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();
      
        
        loginPage.typeUserName(User_Name);
        loginPage.typePassWord(Password);
       
        DashboardPage dashboard = loginPage.clickOnLogin();
             
         ManagementMenu entityManage = dashboard.clickOnFeeManagement();
                                
           FeesListPage feesListPage = entityManage.clickOnFeesList();
         
           feesListPage.typeEntrFeeCodeOrName(Fee_Name_EN);
           
           feesListPage.clickOnAutoSuggItem();
          
           feesListPage.clickOnEntireRow();
          
           feesListPage.clickOnDeactivateIcon();
         
           feesListPage.clickOnDeactivateFeeBTN();
          
           feesListPage.clickOnDeactivateFeeDateBTN();
           
           feesListPage.clickOnDeactivateFeeDate();
           
           feesListPage.clickOnDeactivateBTN();
           
           getDriver().navigate().refresh();
           
           getDriver().navigate().refresh();
           
           getDriver().navigate().refresh();
           
           NotificationMenu notifictnMenu = dashboard.clickOnNotificationIcon();
           
           PendingForApproverPage pendingForApproval = notifictnMenu.clickOnNotification();
           
           pendingForApproval.clickOnCheckBoxClick();
           
           pendingForApproval.clickOnSubmitReviewResul();
           
           
        
              
    }

    @Test(dataProvider = "SingleDataProvider", description = "JIRA#AUTO-0008" ,priority=3)
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestTag(name = "area test", value = "data provider")
    @TestTag(name = "specialization", value = "xlsx")
    @XlsDataSourceParameters(path = "xls/demo.xlsx", sheet = "Reactivate_Fees", dsUid = "TUID", dsArgs = "User_Name,Password, Fee_Name_EN")
    public void reactivateFee(String UserName,String Password,String Fee_Name_EN) {
        // Open GSM Arena home page and verify page is opened
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open(); 
        Assert.assertTrue(loginPage.isLoginBTNPresent(),"Login Page is not Opened");        
        loginPage.typeUserName(UserName);
        loginPage.typePassWord(Password);
       
        DashboardPage dashboard = loginPage.clickOnLogin();
        
        Assert.assertTrue(dashboard.isDashboardDisplayed(), "Dashboard Page Not Displayed");
             
         ManagementMenu feeManage = dashboard.clickOnFeeManagement();
        
         
                                        
          FeesListPage feeListPage = feeManage.clickOnFeesList();
          
          
          
          feeListPage.clickOnInactiveTab();
          
          feeListPage.typeEntrFeeCodeOrName(Fee_Name_EN);
         
          feeListPage.clickOnAutoSuggItem();
         
          feeListPage.clickOnEntireRow();
         
          feeListPage.clickOnReactivateBTN();
          
          feeListPage.clickOnSelectDateAndTime();
          
          feeListPage.selectUpdateDateBTN();
        
          feeListPage.clearEndDate();
          
          feeListPage.clickOnSaveFee();
          
          feeListPage.successfullMessageForReactivateFees();
          
          feeListPage.clickOnOkBTN();
          
          getDriver().navigate().refresh();
          getDriver().navigate().refresh();
          getDriver().navigate().refresh();
          
          
          feeListPage.clickOnInprogressTab();
          
          feeListPage.typeEntrFeeCodeOrName(Fee_Name_EN);
          
          feeListPage.clickOnAutoSuggItem();
          
          feeListPage.clickOnEntireRow();
          
          feeListPage.clickOnCheckBox();
          
          feeListPage.clickOnSubmitForApproval();
          
          feeListPage.clickOnOkBTN();
          
          getDriver().navigate().refresh();
          getDriver().navigate().refresh();
          getDriver().navigate().refresh();
          
          
                   
          NotificationMenu notifictnMenu = dashboard.clickOnNotificationIcon();
          
          PendingForApproverPage pendingForApproval = notifictnMenu.clickOnNotification();
          
          pendingForApproval.clickOnCheckBoxClick();
          
          pendingForApproval.clickOnSubmitReviewResul();
          
        ConfirmationReceivedPage confirmatnReceived = pendingForApproval.clickOnOKBTN();
        
        confirmatnReceived.getFeeDetails();
          
          
          
        
        
        
    }
    

  
}
