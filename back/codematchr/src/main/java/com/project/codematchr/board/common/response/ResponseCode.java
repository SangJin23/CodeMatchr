package com.project.codematchr.board.common.response;

import javax.persistence.criteria.CriteriaBuilder.In;

public interface ResponseCode {
    
    String SUCCESS = "SU";

    String Request_Parameter_Validation_Failed = "VF";

    String Existed_User_Email = "EE";
    String Existed_User_Nickname = "EN";
    String Existed_User_Telnumber = "ET";
    
     String Sign_In_Fail = "SF";

    String Database_Error = "DE";
   

}
