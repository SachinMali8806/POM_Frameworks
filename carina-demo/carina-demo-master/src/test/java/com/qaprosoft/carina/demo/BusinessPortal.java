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
import com.qaprosoft.carina.core.foundation.webdriver.Screenshot;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
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
import com.qaprosoft.carina.demo.gui.pages.EntityListPage;

import com.qaprosoft.carina.demo.gui.pages.LoginPage;
import com.qaprosoft.carina.demo.gui.pages.ModelInfoPage;
import com.qaprosoft.carina.demo.gui.pages.NewEntityPage;
import com.qaprosoft.carina.demo.gui.pages.NewUserPage;

import com.qaprosoft.carina.demo.gui.pages.PendingForApproverPage;
import com.qaprosoft.carina.demo.gui.pages.UserListPage;

/**
 * This sample shows how create Web test.
 * 
 * @author qpsdemo
 */
public class BusinessPortal extends AbstractTest {
    @Test(dataProvider = "SingleDataProvider", description = "JIRA#AUTO-0008" ,priority=0)
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P0)
    @TestTag(name = "area test", value = "data provider")
    @TestTag(name = "specialization", value = "xlsx")
    @XlsDataSourceParameters(path = "xls/demo.xlsx", sheet = "New_Entity", dsUid = "TUID", dsArgs = "User_Name, Password, FMIS_Entity_Code, Entity_Name_EN, Nationality, Entity_Type,Comm_Reg_Num,Estab_Date,Parent_Entity,Entity_Name_AR,Location,Entity_Category,Tax_Reg_Num,Country,City,Address_Line_1")
    public void newEntity(String User_Name, String Password, String FMIS_Entity_Code, String Entity_Name_EN, String Nationality, String Entity_Type,String Comm_Reg_Num,String Estab_Date,String Parent_Entity,String Entity_Name_AR,String Location,String Entity_Category,String Tax_Reg_Num ,String Country ,String City,String Address_Line_1) {
        // Open GSM Arena home page and verify page is opened
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();
        
        Assert.assertTrue(loginPage.isLoginBTNPresent(), "Business Portal Login Page is Not Displayed");
      
        
        loginPage.typeUserName(User_Name);
        loginPage.typePassWord(Password);
       
        DashboardPage dashboard = loginPage.clickOnLogin();
        
        Assert.assertTrue(dashboard.isDashboardDisplayed(),"Dashboard Page is Not Displayed");
           
         ManagementMenu entityManage = dashboard.clickOnEntityManagement();
         
         Assert.assertTrue(entityManage.isNewEntityFieldVisible(), "New Entity Field Not Displayed");
                                
         NewEntityPage newEntityPage = entityManage.clickOnNewEntity();
         
         Assert.assertTrue(newEntityPage.isNewEntityPageTitleDisplayed(),"New Entity Page Details Not Visible");
         
         newEntityPage.typeFMISInput(FMIS_Entity_Code);
         
           
         newEntityPage.typeEntityNameEN(Entity_Name_EN);
         
         newEntityPage.selectEntityType(Entity_Type);
               
         newEntityPage.typeCommercialRegNum(Comm_Reg_Num);
         
         newEntityPage.clickOnSelectDate();
         
         newEntityPage.clickOnTodaysDate();
         
         newEntityPage.selectParentEntityInput(Parent_Entity);
                  
         newEntityPage.typeEntityNameAR(Entity_Name_AR);
         
         newEntityPage.selectLocation(Location);
         
         newEntityPage.selectEntityCategory(Entity_Category);
                
         newEntityPage.typeTaxRegNum(Tax_Reg_Num);
         
         
         
        EntityContactInformationPage entityContactInfoPage = newEntityPage.clickOnContactInforBTN();
        
        Assert.assertTrue(entityContactInfoPage.isEntityContactInfoPage(),"Entity Contact Information Details is Not Displayed");
        
        entityContactInfoPage.typeCountry(Country);
                
        entityContactInfoPage.sendCity(City);
         
        entityContactInfoPage.typeAddresLine1(Address_Line_1); 
         
        entityContactInfoPage.clickOnSubmitBTN(); 
        
        newEntityPage.getMessageAfterSubmit();
        
        newEntityPage.clickOnOkBTN();
      
        getDriver().navigate().refresh();
       
        getDriver().navigate().refresh();
        
        Assert.assertTrue(dashboard.isNotificationIconDisplayed(), "Notification Icon is Not Displayed");
        
        NotificationMenu notifictnMenu = dashboard.clickOnNotificationIcon();
        
        PendingForApproverPage pendingForApproval = notifictnMenu.clickOnNotification();
        
        Assert.assertTrue(pendingForApproval.isApproveBTNDisplayed(), "Approve BTN is Not Displayed");
        
        pendingForApproval.clickOnApproveBTN();
        
       
        ConfirmationReceivedPage confrmatnPage = pendingForApproval.clickOnOKBTN();
        
        Assert.assertTrue(confrmatnPage.isConfirmationMsgDisplayed(),"Confirmation is Not Displayed");
        
   
        confrmatnPage.getConfirmationMsg();
        
        
      Assert.assertTrue(dashboard.isLogOutBTNVisible(), "LogOut BTN Not Visible");
        
        dashboard.clickOnLogOut();
        
        
       // pendingForApproval.getMssgAfterSubmitforApproval();
        
       
        
        
        
        
        
    }
    
    @Test(dataProvider = "SingleDataProvider", description = "JIRA#AUTO-0008",priority=7)
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestTag(name = "area test", value = "data provider")
    @TestTag(name = "specialization", value = "xlsx")
    @XlsDataSourceParameters(path = "xls/demo.xlsx", sheet = "Deactivate_Entities", dsUid = "TUID", dsArgs = "User_Name, Password, Entity_Name_EN")
    public void deactivateEntity(String User_Name, String Password, String Entity_Name_EN) {
        // Open GSM Arena home page and verify page is opened
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();
      
        
        loginPage.typeUserName(User_Name);
        loginPage.typePassWord(Password);
       
        DashboardPage dashboard = loginPage.clickOnLogin();
             
         ManagementMenu entityManage = dashboard.clickOnEntityManagement();
                                
          EntityListPage entityListPage = entityManage.clickOnEntityList();
          
          entityListPage.typeEntrEntityCodeOrName(Entity_Name_EN);
          
          entityListPage.clickOnAutoSuggItem();
          
          entityListPage.clickOnEntireRow();
        
          entityListPage.clickOnDeactivateIcon();
         
          entityListPage.clickOnDeactivateEntityBTN();
          
          entityListPage.clickOnConfirmBTN();
          
          entityListPage.clickOnOkBTN();
         
          getDriver().navigate().refresh();
          
          getDriver().navigate().refresh();
          
        NotificationMenu notifictnMenu = dashboard.clickOnNotificationIcon();
        
        PendingForApproverPage pendingForApproval = notifictnMenu.clickOnNotification();
        
        pendingForApproval.clickOnApproveBTN();
        
        ConfirmationReceivedPage confrmatnPage = pendingForApproval.clickOnOKBTN();
        
        confrmatnPage.getConfirmationMsg();
        
        dashboard.clickOnLogOut();
        
        
        
        
        
        
    }

    @Test(dataProvider = "SingleDataProvider", description = "JIRA#AUTO-0008",priority=2)
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestTag(name = "area test", value = "data provider")
    @TestTag(name = "specialization", value = "xlsx")
    @XlsDataSourceParameters(path = "xls/demo.xlsx", sheet = "Modify_Entities", dsUid = "TUID", dsArgs = "User_Name, Password, Entity_Name_EN,New_Entity_Name_EN,Nationality,Entity_Name_AR,Location,Country,City,Address_Line_1")
    public void modifyEntity(String User_Name, String Password, String Entity_Name_EN, String New_Entity_Name_EN, String Nationality, String Entity_Name_AR, String Location,String Country,String City,String Address_Line_1) {
        // Open GSM Arena home page and verify page is opened
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();
      
        
        loginPage.typeUserName(User_Name);
        loginPage.typePassWord(Password);
       
        DashboardPage dashboard = loginPage.clickOnLogin();
             
         ManagementMenu entityManage = dashboard.clickOnEntityManagement();
                                
          EntityListPage entityListPage = entityManage.clickOnEntityList();
          
          entityListPage.typeEntrEntityCodeOrName(Entity_Name_EN);
          
          entityListPage.clickOnAutoSuggItem();
                   
          entityListPage.clickOnEntireRow();
        
          NewEntityPage modifyEntityPage = entityListPage.clickOnModifyIcon();
          
          
          
          if (!New_Entity_Name_EN.equals("")) {
        	  modifyEntityPage.typeEntityNameEN(New_Entity_Name_EN);
		}
          System.out.println("-----"+Nationality+"-------");
          
          if (!Nationality.equals("")) {
        	  modifyEntityPage.typeNationality(Nationality);
		}
          
          System.out.println("-------"+Entity_Name_AR+"-------");
          if (!Entity_Name_AR.equals("")) {
        	  modifyEntityPage.typeEntityNameAR(Entity_Name_AR);
			
		}
          System.out.println("-------"+Location+"-------");
          if (!Location.equals("")) {
        	  modifyEntityPage.selectLocation(Location);
		}
          
          
          
          EntityContactInformationPage entityContactInfoPage = modifyEntityPage.clickOnContactInforBTN();
          
          if (!Country.equals("")) {
        	  
        	  entityContactInfoPage.typeCountry(Country);
			
		}
          
           if (!City.equals("")) {
        	  
	             entityContactInfoPage.sendCity(City);
			
		              }
                  
          
           if (!Address_Line_1.equals("")) {
         	  
        	   entityContactInfoPage.typeAddresLine1(Address_Line_1);
			
		              }
           
           
          entityContactInfoPage.clickOnSubmitBTN(); 
          
            
         getDriver().navigate().refresh();
                             
         getDriver().navigate().refresh();
        
        NotificationMenu notifictnMenu = dashboard.clickOnNotificationIcon();
        
        PendingForApproverPage pendingForApproval = notifictnMenu.clickOnNotification();
        
        pendingForApproval.clickOnApproveBTN();
        
        ConfirmationReceivedPage confrmatnPage = pendingForApproval.clickOnOKBTN();
        
        confrmatnPage.getConfirmationMsg();
     
        dashboard.clickOnLogOut();
        
        
        
        
        
        
        
        
        
    }
    
    
    @Test(dataProvider = "SingleDataProvider", description = "JIRA#AUTO-0008" ,priority=2)
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P0)
    @TestTag(name = "area test", value = "data provider")
    @TestTag(name = "specialization", value = "xlsx")
    @XlsDataSourceParameters(path = "xls/demo.xlsx", sheet = "New_User", dsUid = "TUID", dsArgs = "User_Name, Password, Title, First_Name_EN, Middle_Name_EN, Last_Name_EN,Designation,Gender,User_Type,Emirates_ID,Contact_Channel,First_Name_AR,Middle_Name_AR,Last_Name_AR,Nationality,Display_Language,Preferred_Contact_Time,Entity_Of_User,Country_of_Residence,City,Address_Line_1,Primary_Email_Address,ISD_Code,Mobile_Number,Module_List,Related_Roles,Functions")
    public void newUser(String User_Name, String Password, String Title, String First_Name_EN, String Middle_Name_EN, String Last_Name_EN,String Designation,String Gender,String User_Type,String Emirates_ID,String Contact_Channel,String First_Name_AR,String Middle_Name_AR ,String Last_Name_AR ,String Nationality,String Display_Language,String Preferred_Contact_Time ,String Entity_Of_User ,String Country_of_Residence,String City,String Address_Line_1 ,String Primary_Email_Address ,String ISD_Code,String Mobile_Number,String Module_List ,String Related_Roles ,String Functions) {
        // Open GSM Arena home page and verify page is opened
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();
      
        
        loginPage.typeUserName(User_Name);
        loginPage.typePassWord(Password);
       
        DashboardPage dashboard = loginPage.clickOnLogin();
           
         ManagementMenu userManage = dashboard.clickOnUserManagement();
                                
           NewUserPage newUserPage = userManage.clickOnNewUser();
           
           newUserPage.selectTitle(Title); 
           
           newUserPage.typeFullNameEN(First_Name_EN, Middle_Name_EN, Last_Name_EN);
           
           newUserPage.typeDesignation(Designation);
           
           newUserPage.selectGender(Gender);
           
           newUserPage.selectUserType(User_Type);
           
           newUserPage.typeEmirateID(Emirates_ID);
           
           newUserPage.selectPreffContactChannel(Contact_Channel);
           
           newUserPage.typeFullNameAR(First_Name_AR, Middle_Name_AR, Last_Name_AR);
           
           newUserPage.selectNationality(Nationality);
           
           newUserPage.selectDisplayLanguage(Display_Language);
           
           newUserPage.selectPreffContactTime(Preferred_Contact_Time);
           
           newUserPage.selectEntityOftheUser(Entity_Of_User);
           
           newUserPage.clickOnContactInforBTN();
           
           newUserPage.selectCountryOfResidence(Country_of_Residence);
           
           newUserPage.typeCity(City);
           
           newUserPage.typeAddressLine1(Address_Line_1);
           
           newUserPage.typePrimaryEmailAddress(Primary_Email_Address);
           
           newUserPage.selectISDCode(ISD_Code);
           
           newUserPage.typeMobileNumber(Mobile_Number);
           
           newUserPage.clickOnAccessPermission();
           
           newUserPage.addModuleList(Module_List);
           
           newUserPage.addRelatedRoles(Related_Roles);
           
           newUserPage.addFunctions(Functions);
           
           newUserPage.clickOnSubmit();
         
           newUserPage.clickOnOK();
           
        getDriver().navigate().refresh();
       
        getDriver().navigate().refresh();
        
        NotificationMenu notifictnMenu = dashboard.clickOnNotificationIcon();
        
        PendingForApproverPage pendingForApproval = notifictnMenu.clickOnNotification();
        
        pendingForApproval.clickOnApproveBTN();
        
        ConfirmationReceivedPage confrmatnPage = pendingForApproval.clickOnOKBTN();
        
        confrmatnPage.getUserApprovedDetails();
        
        dashboard.clickOnLogOut();
        
        
       
        
       
        
        
        
        
        
    }

    
    @Test(dataProvider = "SingleDataProvider", description = "JIRA#AUTO-0008",priority=4)
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestTag(name = "area test", value = "data provider")
    @TestTag(name = "specialization", value = "xlsx")
    @XlsDataSourceParameters(path = "xls/demo.xlsx", sheet = "Deactivate_User", dsUid = "TUID", dsArgs = "User_Name, Password, User_Name_EN")
    public void deactivateUser(String User_Name, String Password, String User_Name_EN) {
        // Open GSM Arena home page and verify page is opened
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();
      
        
        loginPage.typeUserName(User_Name);
        loginPage.typePassWord(Password);
       
        DashboardPage dashboard = loginPage.clickOnLogin();
             
         ManagementMenu userManage = dashboard.clickOnUserManagement();
                                
           UserListPage userListPage = userManage.clickOnUserList();
          
           userListPage.typeEntrUserIDOrName(User_Name_EN);
          
           userListPage.clickOnAutoSuggItem();
          
           userListPage.clickOnEntireRow();
        
           userListPage.clickOnDeactivateIcon();
           
           userListPage.clickOnOkBTN();
         
           userListPage.clickOnDeactivateUserBTN();
          
           userListPage.clickOnConfirmBTN();
          
           userListPage.clickOnOkBTN();
         
          getDriver().navigate().refresh();
          
          getDriver().navigate().refresh();
          
        NotificationMenu notifictnMenu = dashboard.clickOnNotificationIcon();
        
        PendingForApproverPage pendingForApproval = notifictnMenu.clickOnNotification();
        
        pendingForApproval.clickOnApproveBTN();
        
        ConfirmationReceivedPage confrmatnPage = pendingForApproval.clickOnOKBTN();
        
        confrmatnPage.getUserApprovedDetails();
        
        dashboard.clickOnLogOut();
        
        
        
        
        
        
        
        
        
        
    }

    @Test(dataProvider = "SingleDataProvider", description = "JIRA#AUTO-0008",priority=1)
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P3)
    @TestTag(name = "area test", value = "data provider")
    @TestTag(name = "specialization", value = "xlsx")
    @XlsDataSourceParameters(path = "xls/demo.xlsx", sheet = "Modify_User", dsUid = "TUID", dsArgs = "User_Name, Password, User_Name_EN,Title,Designation,Emirates_ID,Contact_Channel,Display_Language,Preferred_Contact_Time,Country_of_Residence,City,Address_Line_1,Primary_Email_Address,ISD_Code,Mobile_Number,Module_List,Related_Roles,Functions")
    public void modifyUser(String User_Name, String Password, String User_Name_EN, String Title, String Designation, String Emirates_ID, String Contact_Channel,String Display_Language,String Preferred_Contact_Time,String Country_of_Residence,String City,String Address_Line_1,String Primary_Email_Address,String ISD_Code,String Mobile_Number,String Module_List,String Related_Roles,String Functions) {
        // Open GSM Arena home page and verify page is opened
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();
      
        
        loginPage.typeUserName(User_Name);
        loginPage.typePassWord(Password);
       
        DashboardPage dashboard = loginPage.clickOnLogin();
             
         ManagementMenu userManage = dashboard.clickOnUserManagement();
                                
           UserListPage userListPage = userManage.clickOnUserList();
          
           userListPage.typeEntrUserIDOrName(User_Name_EN);
          
           userListPage.clickOnAutoSuggItem();
                   
           userListPage.clickOnEntireRow();
        
            NewUserPage modifyUserPage = userListPage.clickOnModifyIcon();
            
            modifyUserPage.clickOnOK();
          
          if (!Title.equals("")) {
        	  modifyUserPage.selectTitle(Title);
		}
         
          if (!Designation.equals("")) {
        	  modifyUserPage.typeDesignation(Designation);
		}
          
          System.out.println(Emirates_ID);
          
          if (!Emirates_ID.equals("")) {
        	  modifyUserPage.typeEmirateID(Emirates_ID);
			
		}
         
          if (!Contact_Channel.equals("")) {
        	  modifyUserPage.selectPreffContactChannel(Contact_Channel);
		}
          
                  
          if (!Display_Language.equals("")) {
        	  modifyUserPage.selectDisplayLanguage(Display_Language);
		}
          
          if (!Preferred_Contact_Time.equals("")) {
        	  modifyUserPage.selectPreffContactTime(Preferred_Contact_Time);
		}
          
          modifyUserPage.clickOnContactInforBTN();
          
          if (!Country_of_Residence.equals("")) {
        	  modifyUserPage.selectCountryOfResidence(Country_of_Residence);
		}
          
          if (!City.equals("")) {
        	  modifyUserPage.typeCity(City);
		}
          
          if (!Address_Line_1.equals("")) {
        	  modifyUserPage.typeAddressLine1(Address_Line_1);
		}
          
          if (!Primary_Email_Address.equals("")) {
        	  modifyUserPage.typePrimaryEmailAddress(Primary_Email_Address);
		}
          
          if (!ISD_Code.equals("")) {
        	  modifyUserPage.selectISDCode(ISD_Code);
		}
          
          if (!Mobile_Number.equals("")) {
        	  modifyUserPage.typeMobileNumber(Mobile_Number);
		}
          
          modifyUserPage.clickOnAccessPermission();
          
          if (!Module_List.equals("")) {
        	  modifyUserPage.addModuleList(Module_List);
		}
         
          if (!Related_Roles.equals("")) {
        	  modifyUserPage.addRelatedRoles(Related_Roles);
		}
          
          if (!Functions.equals("")) {
        	  modifyUserPage.addFunctions(Functions);
		}
         
          modifyUserPage.clickOnSubmit();
          
        
    
            
         getDriver().navigate().refresh();
                             
         getDriver().navigate().refresh();
         
         getDriver().navigate().refresh();
        
        NotificationMenu notifictnMenu = dashboard.clickOnNotificationIcon();
        
        PendingForApproverPage pendingForApproval = notifictnMenu.clickOnNotification();
        
        pendingForApproval.clickOnApproveBTN();
        
        ConfirmationReceivedPage confrmatnPage = pendingForApproval.clickOnOKBTN();
        
        confrmatnPage.getUserApprovedDetails();
     
        dashboard.clickOnLogOut();
        
        
        
        
        
        
        
        
        
    }
    


  
}
