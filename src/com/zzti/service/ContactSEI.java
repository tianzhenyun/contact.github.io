package com.zzti.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.8
 * 2014-03-15T22:33:15.742+08:00
 * Generated source version: 2.7.8
 * 
 */
@WebService(targetNamespace = "http://service.zzti.com/", name = "ContactSEI")
@XmlSeeAlso({ObjectFactory.class})
public interface ContactSEI {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "class_getList", targetNamespace = "http://service.zzti.com/", className = "com.zzti.service.ClassGetList")
    @WebMethod(operationName = "class_getList")
    @ResponseWrapper(localName = "class_getListResponse", targetNamespace = "http://service.zzti.com/", className = "com.zzti.service.ClassGetListResponse")
    public com.zzti.service.ListResult classGetList();

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "android_class_getlist", targetNamespace = "http://service.zzti.com/", className = "com.zzti.service.AndroidClassGetlist")
    @WebMethod(operationName = "android_class_getlist")
    @ResponseWrapper(localName = "android_class_getlistResponse", targetNamespace = "http://service.zzti.com/", className = "com.zzti.service.AndroidClassGetlistResponse")
    public java.lang.String androidClassGetlist();

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "contact_add", targetNamespace = "http://service.zzti.com/", className = "com.zzti.service.ContactAdd")
    @WebMethod(operationName = "contact_add")
    @ResponseWrapper(localName = "contact_addResponse", targetNamespace = "http://service.zzti.com/", className = "com.zzti.service.ContactAddResponse")
    public com.zzti.service.Result contactAdd(
        @WebParam(name = "arg0", targetNamespace = "")
        com.zzti.service.Contact arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "contact_update", targetNamespace = "http://service.zzti.com/", className = "com.zzti.service.ContactUpdate")
    @WebMethod(operationName = "contact_update")
    @ResponseWrapper(localName = "contact_updateResponse", targetNamespace = "http://service.zzti.com/", className = "com.zzti.service.ContactUpdateResponse")
    public com.zzti.service.Result contactUpdate(
        @WebParam(name = "arg0", targetNamespace = "")
        com.zzti.service.Contact arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "class_getModel", targetNamespace = "http://service.zzti.com/", className = "com.zzti.service.ClassGetModel")
    @WebMethod(operationName = "class_getModel")
    @ResponseWrapper(localName = "class_getModelResponse", targetNamespace = "http://service.zzti.com/", className = "com.zzti.service.ClassGetModelResponse")
    public com.zzti.service.TResult classGetModel(
        @WebParam(name = "arg0", targetNamespace = "")
        com.zzti.service.Class arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "android_contact_add", targetNamespace = "http://service.zzti.com/", className = "com.zzti.service.AndroidContactAdd")
    @WebMethod(operationName = "android_contact_add")
    @ResponseWrapper(localName = "android_contact_addResponse", targetNamespace = "http://service.zzti.com/", className = "com.zzti.service.AndroidContactAddResponse")
    public java.lang.String androidContactAdd(
        @WebParam(name = "string", targetNamespace = "")
        java.lang.String string
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "android_contact_delete", targetNamespace = "http://service.zzti.com/", className = "com.zzti.service.AndroidContactDelete")
    @WebMethod(operationName = "android_contact_delete")
    @ResponseWrapper(localName = "android_contact_deleteResponse", targetNamespace = "http://service.zzti.com/", className = "com.zzti.service.AndroidContactDeleteResponse")
    public java.lang.String androidContactDelete(
        @WebParam(name = "string", targetNamespace = "")
        java.lang.String string
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "android_contact_getlist", targetNamespace = "http://service.zzti.com/", className = "com.zzti.service.AndroidContactGetlist")
    @WebMethod(operationName = "android_contact_getlist")
    @ResponseWrapper(localName = "android_contact_getlistResponse", targetNamespace = "http://service.zzti.com/", className = "com.zzti.service.AndroidContactGetlistResponse")
    public java.lang.String androidContactGetlist(
        @WebParam(name = "string", targetNamespace = "")
        java.lang.String string
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "class_add", targetNamespace = "http://service.zzti.com/", className = "com.zzti.service.ClassAdd")
    @WebMethod(operationName = "class_add")
    @ResponseWrapper(localName = "class_addResponse", targetNamespace = "http://service.zzti.com/", className = "com.zzti.service.ClassAddResponse")
    public com.zzti.service.Result classAdd(
        @WebParam(name = "arg0", targetNamespace = "")
        com.zzti.service.Class arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "class_update", targetNamespace = "http://service.zzti.com/", className = "com.zzti.service.ClassUpdate")
    @WebMethod(operationName = "class_update")
    @ResponseWrapper(localName = "class_updateResponse", targetNamespace = "http://service.zzti.com/", className = "com.zzti.service.ClassUpdateResponse")
    public com.zzti.service.Result classUpdate(
        @WebParam(name = "arg0", targetNamespace = "")
        com.zzti.service.Class arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "contact_exists", targetNamespace = "http://service.zzti.com/", className = "com.zzti.service.ContactExists")
    @WebMethod(operationName = "contact_exists")
    @ResponseWrapper(localName = "contact_existsResponse", targetNamespace = "http://service.zzti.com/", className = "com.zzti.service.ContactExistsResponse")
    public boolean contactExists(
        @WebParam(name = "arg0", targetNamespace = "")
        com.zzti.service.Contact arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "android_contact_getmodel", targetNamespace = "http://service.zzti.com/", className = "com.zzti.service.AndroidContactGetmodel")
    @WebMethod(operationName = "android_contact_getmodel")
    @ResponseWrapper(localName = "android_contact_getmodelResponse", targetNamespace = "http://service.zzti.com/", className = "com.zzti.service.AndroidContactGetmodelResponse")
    public java.lang.String androidContactGetmodel(
        @WebParam(name = "string", targetNamespace = "")
        java.lang.String string
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "contact_delete", targetNamespace = "http://service.zzti.com/", className = "com.zzti.service.ContactDelete")
    @WebMethod(operationName = "contact_delete")
    @ResponseWrapper(localName = "contact_deleteResponse", targetNamespace = "http://service.zzti.com/", className = "com.zzti.service.ContactDeleteResponse")
    public com.zzti.service.Result contactDelete(
        @WebParam(name = "arg0", targetNamespace = "")
        com.zzti.service.Contact arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "android_contact_update", targetNamespace = "http://service.zzti.com/", className = "com.zzti.service.AndroidContactUpdate")
    @WebMethod(operationName = "android_contact_update")
    @ResponseWrapper(localName = "android_contact_updateResponse", targetNamespace = "http://service.zzti.com/", className = "com.zzti.service.AndroidContactUpdateResponse")
    public java.lang.String androidContactUpdate(
        @WebParam(name = "string", targetNamespace = "")
        java.lang.String string
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "contact_getModel", targetNamespace = "http://service.zzti.com/", className = "com.zzti.service.ContactGetModel")
    @WebMethod(operationName = "contact_getModel")
    @ResponseWrapper(localName = "contact_getModelResponse", targetNamespace = "http://service.zzti.com/", className = "com.zzti.service.ContactGetModelResponse")
    public com.zzti.service.TResult contactGetModel(
        @WebParam(name = "arg0", targetNamespace = "")
        com.zzti.service.Contact arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "contact_getList", targetNamespace = "http://service.zzti.com/", className = "com.zzti.service.ContactGetList")
    @WebMethod(operationName = "contact_getList")
    @ResponseWrapper(localName = "contact_getListResponse", targetNamespace = "http://service.zzti.com/", className = "com.zzti.service.ContactGetListResponse")
    public com.zzti.service.ListResult contactGetList(
        @WebParam(name = "arg0", targetNamespace = "")
        com.zzti.service.Contact arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "class_delete", targetNamespace = "http://service.zzti.com/", className = "com.zzti.service.ClassDelete")
    @WebMethod(operationName = "class_delete")
    @ResponseWrapper(localName = "class_deleteResponse", targetNamespace = "http://service.zzti.com/", className = "com.zzti.service.ClassDeleteResponse")
    public com.zzti.service.Result classDelete(
        @WebParam(name = "arg0", targetNamespace = "")
        com.zzti.service.Class arg0
    );
}
