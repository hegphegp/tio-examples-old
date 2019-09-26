// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat.proto

package org.tio.examples.im.common.packets;

public final class Chat {
  private Chat() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Group_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Group_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Client_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Client_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Geolocation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Geolocation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Address_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Address_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AuthReqBody_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AuthReqBody_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AuthRespBody_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AuthRespBody_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LoginReqBody_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LoginReqBody_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LoginRespBody_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LoginRespBody_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JoinGroupReqBody_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_JoinGroupReqBody_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JoinGroupRespBody_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_JoinGroupRespBody_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JoinGroupNotifyRespBody_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_JoinGroupNotifyRespBody_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ExitGroupNotifyRespBody_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ExitGroupNotifyRespBody_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChatReqBody_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChatReqBody_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChatRespBody_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChatRespBody_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientPageReqBody_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientPageReqBody_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientPageRespBody_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientPageRespBody_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BeginToLiveReqBody_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BeginToLiveReqBody_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BeginToLiveRespBody_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BeginToLiveRespBody_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EndLiveReqBody_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EndLiveReqBody_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EndLiveRespBody_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EndLiveRespBody_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nchat.proto\"0\n\004User\022\n\n\002id\030\001 \001(\003\022\014\n\004nick" +
      "\030\002 \001(\t\022\016\n\006avatar\030\003 \001(\t\"P\n\005Group\022\n\n\002id\030\001 " +
      "\001(\003\022\014\n\004nick\030\002 \001(\t\022\016\n\006avatar\030\003 \001(\t\022\r\n\005tot" +
      "al\030\004 \001(\005\022\016\n\006online\030\005 \001(\005\"\266\001\n\006Client\022\n\n\002i" +
      "d\030\001 \001(\t\022\n\n\002ip\030\002 \001(\t\022\014\n\004port\030\003 \001(\005\022\023\n\004use" +
      "r\030\004 \001(\0132\005.User\022\016\n\006region\030\005 \001(\t\022\021\n\tuserag" +
      "ent\030\006 \001(\t\022\020\n\010operator\030\007 \001(\t\022!\n\013geolocati" +
      "on\030\010 \001(\0132\014.Geolocation\022\031\n\007address\030\t \001(\0132" +
      "\010.Address\"\'\n\013Geolocation\022\013\n\003lng\030\001 \001(\001\022\013\n" +
      "\003lat\030\002 \001(\001\"\257\001\n\007Address\022\030\n\020formattedaddre",
      "ss\030\001 \001(\t\022\016\n\006adcode\030\002 \001(\t\022\020\n\010province\030\003 \001" +
      "(\t\022\014\n\004city\030\004 \001(\t\022\020\n\010citycode\030\005 \001(\t\022\020\n\010di" +
      "strict\030\006 \001(\t\022\020\n\010township\030\007 \001(\t\022\016\n\006street" +
      "\030\010 \001(\t\022\024\n\014streetnumber\030\t \001(\t\"\335\001\n\013AuthReq" +
      "Body\022\r\n\005token\030\001 \001(\t\022\020\n\010deviceId\030\002 \001(\t\022\013\n" +
      "\003seq\030\003 \001(\003\022\037\n\ndeviceType\030\004 \001(\0162\013.DeviceT" +
      "ype\022\013\n\003cid\030\005 \001(\t\022\022\n\nappVersion\030\006 \001(\t\022\022\n\n" +
      "deviceInfo\030\007 \001(\t\022\014\n\004sign\030\010 \001(\t\022!\n\013geoloc" +
      "ation\030\t \001(\0132\014.Geolocation\022\031\n\007address\030\n \001" +
      "(\0132\010.Address\"\016\n\014AuthRespBody\"B\n\014LoginReq",
      "Body\022\021\n\tloginname\030\001 \001(\t\022\020\n\010password\030\002 \001(" +
      "\t\022\r\n\005token\030\003 \001(\t\"3\n\rLoginRespBody\022\r\n\005tok" +
      "en\030\001 \001(\t\022\023\n\004user\030\002 \001(\0132\005.User\"!\n\020JoinGro" +
      "upReqBody\022\r\n\005group\030\001 \001(\t\"D\n\021JoinGroupRes" +
      "pBody\022 \n\006result\030\001 \001(\0162\020.JoinGroupResult\022" +
      "\r\n\005group\030\002 \001(\t\"A\n\027JoinGroupNotifyRespBod" +
      "y\022\027\n\006client\030\001 \001(\0132\007.Client\022\r\n\005group\030\002 \001(" +
      "\t\"A\n\027ExitGroupNotifyRespBody\022\027\n\006client\030\001" +
      " \001(\0132\007.Client\022\r\n\005group\030\002 \001(\t\"_\n\013ChatReqB" +
      "ody\022\014\n\004time\030\001 \001(\003\022\027\n\004type\030\002 \001(\0162\t.ChatTy",
      "pe\022\014\n\004text\030\003 \001(\t\022\r\n\005group\030\004 \001(\t\022\014\n\004toId\030" +
      "\005 \001(\t\"\226\001\n\014ChatRespBody\022\014\n\004time\030\001 \001(\003\022\027\n\004" +
      "type\030\002 \001(\0162\t.ChatType\022\014\n\004text\030\003 \001(\t\022\033\n\nf" +
      "romClient\030\004 \001(\0132\007.Client\022\031\n\010toClient\030\005 \001" +
      "(\0132\007.Client\022\r\n\005group\030\006 \001(\t\022\n\n\002id\030\007 \001(\t\"G" +
      "\n\021ClientPageReqBody\022\021\n\tpageIndex\030\001 \001(\005\022\020" +
      "\n\010pageSize\030\002 \001(\005\022\r\n\005group\030\003 \001(\t\"h\n\022Clien" +
      "tPageRespBody\022\021\n\tpageIndex\030\001 \001(\005\022\020\n\010page" +
      "Size\030\002 \001(\005\022\023\n\013recordCount\030\003 \001(\005\022\030\n\007clien" +
      "ts\030\004 \003(\0132\007.Client\"\"\n\022BeginToLiveReqBody\022",
      "\014\n\004time\030\001 \001(\003\"`\n\023BeginToLiveRespBody\022\014\n\004" +
      "time\030\001 \001(\003\022\016\n\006liveid\030\002 \001(\003\022\026\n\016rtmppublis" +
      "hurl\030\003 \001(\t\022\023\n\013rtmpliveurl\030\004 \001(\t\"\036\n\016EndLi" +
      "veReqBody\022\014\n\004time\030\001 \001(\003\"/\n\017EndLiveRespBo" +
      "dy\022\014\n\004time\030\001 \001(\003\022\016\n\006liveid\030\002 \001(\003*f\n\nDevi" +
      "ceType\022\026\n\022DEVICE_TYPE_UNKNOW\020\000\022\022\n\016DEVICE" +
      "_TYPE_PC\020\001\022\027\n\023DEVICE_TYPE_ANDROID\020\002\022\023\n\017D" +
      "EVICE_TYPE_IOS\020\003*\225\005\n\007Command\022\022\n\016COMMAND_" +
      "UNKNOW\020\000\022\031\n\025COMMAND_HANDSHAKE_REQ\020\001\022\032\n\026C" +
      "OMMAND_HANDSHAKE_RESP\020\002\022\024\n\020COMMAND_AUTH_",
      "REQ\020\003\022\025\n\021COMMAND_AUTH_RESP\020\004\022\032\n\026COMMAND_" +
      "JOIN_GROUP_REQ\020\005\022\033\n\027COMMAND_JOIN_GROUP_R" +
      "ESP\020\006\022\"\n\036COMMAND_JOIN_GROUP_NOTIFY_RESP\020" +
      "\007\022\"\n\036COMMAND_EXIT_GROUP_NOTIFY_RESP\020\010\022\024\n" +
      "\020COMMAND_CHAT_REQ\020\t\022\025\n\021COMMAND_CHAT_RESP" +
      "\020\n\022\032\n\026COMMAND_START_SHOW_REQ\020\013\022\033\n\027COMMAN" +
      "D_START_SHOW_RESP\020\014\022\030\n\024COMMAND_END_SHOW_" +
      "REQ\020\r\022 \n\034COMMAND_END_SHOW_NOTIFY_RESP\020\016\022" +
      "\031\n\025COMMAND_HEARTBEAT_REQ\020\017\022\032\n\026COMMAND_HE" +
      "ARTBEAT_RESP\020\020\022\025\n\021COMMAND_CLOSE_REQ\020\021\022\033\n",
      "\027COMMAND_CLIENT_PAGE_REQ\020\022\022\034\n\030COMMAND_CL" +
      "IENT_PAGE_RESP\020\023\022\025\n\021COMMAND_LOGIN_REQ\020\024\022" +
      "\026\n\022COMMAND_LOGIN_RESP\020\025\022\032\n\026COMMAND_CANCE" +
      "L_MSG_REQ\020\026\022\033\n\027COMMAND_CANCEL_MSG_RESP\020\027" +
      "*\320\001\n\017JoinGroupResult\022\034\n\030JOIN_GROUP_RESUL" +
      "T_UNKNOW\020\000\022\030\n\024JOIN_GROUP_RESULT_OK\020\001\022\037\n\033" +
      "JOIN_GROUP_RESULT_NOT_EXIST\020\002\022 \n\034JOIN_GR" +
      "OUP_RESULT_GROUP_FULL\020\003\022!\n\035JOIN_GROUP_RE" +
      "SULT_IN_BACKLIST\020\004\022\037\n\033JOIN_GROUP_RESULT_" +
      "TAKEOUTED\020\005*M\n\010ChatType\022\024\n\020CHAT_TYPE_UNK",
      "NOW\020\000\022\024\n\020CHAT_TYPE_PUBLIC\020\001\022\025\n\021CHAT_TYPE" +
      "_PRIVATE\020\002B&\n\"org.tio.examples.im.common" +
      ".packetsP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_User_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_User_descriptor,
        new java.lang.String[] { "Id", "Nick", "Avatar", });
    internal_static_Group_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Group_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Group_descriptor,
        new java.lang.String[] { "Id", "Nick", "Avatar", "Total", "Online", });
    internal_static_Client_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Client_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Client_descriptor,
        new java.lang.String[] { "Id", "Ip", "Port", "User", "Region", "Useragent", "Operator", "Geolocation", "Address", });
    internal_static_Geolocation_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Geolocation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Geolocation_descriptor,
        new java.lang.String[] { "Lng", "Lat", });
    internal_static_Address_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Address_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Address_descriptor,
        new java.lang.String[] { "Formattedaddress", "Adcode", "Province", "City", "Citycode", "District", "Township", "Street", "Streetnumber", });
    internal_static_AuthReqBody_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_AuthReqBody_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AuthReqBody_descriptor,
        new java.lang.String[] { "Token", "DeviceId", "Seq", "DeviceType", "Cid", "AppVersion", "DeviceInfo", "Sign", "Geolocation", "Address", });
    internal_static_AuthRespBody_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_AuthRespBody_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AuthRespBody_descriptor,
        new java.lang.String[] { });
    internal_static_LoginReqBody_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_LoginReqBody_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LoginReqBody_descriptor,
        new java.lang.String[] { "Loginname", "Password", "Token", });
    internal_static_LoginRespBody_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_LoginRespBody_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LoginRespBody_descriptor,
        new java.lang.String[] { "Token", "User", });
    internal_static_JoinGroupReqBody_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_JoinGroupReqBody_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_JoinGroupReqBody_descriptor,
        new java.lang.String[] { "Group", });
    internal_static_JoinGroupRespBody_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_JoinGroupRespBody_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_JoinGroupRespBody_descriptor,
        new java.lang.String[] { "Result", "Group", });
    internal_static_JoinGroupNotifyRespBody_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_JoinGroupNotifyRespBody_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_JoinGroupNotifyRespBody_descriptor,
        new java.lang.String[] { "Client", "Group", });
    internal_static_ExitGroupNotifyRespBody_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_ExitGroupNotifyRespBody_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ExitGroupNotifyRespBody_descriptor,
        new java.lang.String[] { "Client", "Group", });
    internal_static_ChatReqBody_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_ChatReqBody_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChatReqBody_descriptor,
        new java.lang.String[] { "Time", "Type", "Text", "Group", "ToId", });
    internal_static_ChatRespBody_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_ChatRespBody_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChatRespBody_descriptor,
        new java.lang.String[] { "Time", "Type", "Text", "FromClient", "ToClient", "Group", "Id", });
    internal_static_ClientPageReqBody_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_ClientPageReqBody_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientPageReqBody_descriptor,
        new java.lang.String[] { "PageIndex", "PageSize", "Group", });
    internal_static_ClientPageRespBody_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_ClientPageRespBody_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientPageRespBody_descriptor,
        new java.lang.String[] { "PageIndex", "PageSize", "RecordCount", "Clients", });
    internal_static_BeginToLiveReqBody_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_BeginToLiveReqBody_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BeginToLiveReqBody_descriptor,
        new java.lang.String[] { "Time", });
    internal_static_BeginToLiveRespBody_descriptor =
      getDescriptor().getMessageTypes().get(18);
    internal_static_BeginToLiveRespBody_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BeginToLiveRespBody_descriptor,
        new java.lang.String[] { "Time", "Liveid", "Rtmppublishurl", "Rtmpliveurl", });
    internal_static_EndLiveReqBody_descriptor =
      getDescriptor().getMessageTypes().get(19);
    internal_static_EndLiveReqBody_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EndLiveReqBody_descriptor,
        new java.lang.String[] { "Time", });
    internal_static_EndLiveRespBody_descriptor =
      getDescriptor().getMessageTypes().get(20);
    internal_static_EndLiveRespBody_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EndLiveRespBody_descriptor,
        new java.lang.String[] { "Time", "Liveid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}