package com.project.codematchr.board.common.response;

public interface ResponseMessage {
    
    String SUCCESS = "SUCCESS";

    String Request_Parameter_Validation_Failed = "Request_Parameter_Validation_Failed";

    String Existed_User_Email = "Existed_User_Email";
    String Existed_User_Nickname = "Existed_User_Nickname";
    String Existed_User_Telnumber = "Existed_User_Telnumber";
    
     String Sign_In_Fail = "Sign_In_Fail";

    String Database_Error = "Database_Error";
   

}
