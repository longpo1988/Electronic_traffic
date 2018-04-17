package com.ut.electronictraffic.interfaces;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Utils
{
  public static final int ANGLE_0 = 0;
  public static final int ANGLE_135 = 135;
  public static final int ANGLE_180 = 180;
  public static final int ANGLE_225 = 225;
  public static final int ANGLE_270 = 270;
  public static final int ANGLE_45 = 45;
  public static final int ANGLE_90 = 90;
  public static final String A_VALUE = "angle";
  public static final String BUS_DISTANCE_VALUE = "distance";
  public static final String BUS_PEOPLE_NUMBER = "peoper_num";
  public static final String BUS_STATION_ID = "stationId";
  public static final String BUS_STATION_ID_VALUE = "station_id";
  public static final String CAR_ADD_VALUE = "car_value";
  public static int[][] CAR_DEFAULT;
  public static int[][] CAR_LOCATON;
  public static int[] CAR_MESSAGE_WAHT = { 1001, 1002, 1003, 1004, 1005, 1006, 2001, 2002, 2003, 2004, 2005, 2006 };
  public static final String CAR_NUMBER_VALUE = "car_num";
  public static int[] CAR_PATH;
  public static int[][][] CAR_RECT;
  public static int[][][] CAR_RECT_SYNC;
  public static final String CAR_VALUE = "carnum";
  public static final String COM_VALUE = "com2";
  public static final int DIRECT_D = 1;
  public static final int DIRECT_L = 2;
  public static final int DIRECT_R = 3;
  public static final int DIRECT_U = 0;
  public static final String D_VALUE = "direct";
  public static final String ETC_COST_VALUE = "etc_cost";
  public static int[][] ETC_ZA;
  public static final int HIGHT = 90;
  public static final String HUM_VALUE = "humiture";
  public static final String ID = "car_id";
  public static final String IP_VALUE = "remoteIp";
  public static final String LIGHT_MODE_VALUE = "light_mode";
  public static final String LIGHT_VALUE = "light";
  public static int[][] LOCATION;
  public static final String LOT_COST_VALUE = "lot_cost";
  public static int[][] PARKINGLOT;
  public static int[][] PARKINGLOT_ZA;
  public static final String PM_VALUE = "pm";
  public static final String PRICE_VALUE = "price";
  public static int[] SHOW_SYNC_INFO;
  public static int[][] STATION;
  public static final String STATION_BUS_VALUE = "bus_num";
  public static final String TEMP_VALUE = "temp";
  public static final String THRESHOLDH_VALUE = "thresholdH";
  public static final String THRESHOLDL_VALUE = "thresholdL";
  public static final String TOTAL_CAR_VALUE = "totalnum";
  public static final String TOTAL_COST_VALUE = "totalcost";
  public static int[][] TRAFFIC_BUS;
  public static int[][] TRAFFIC_CAR;
  public static int[][] TRAFFIC_DEFAULT_MODE;
  public static final String TRAFFIC_ID_VALUE = "traffic_id";
  public static int[] TRAFFIC_MESSAGE_WAHT = { 6001, 6002, 6003, 6004, 6005 };
  public static final String TRAFFIC_TIME_VALUE = "traffic_time";
  public static final int WIDTH = 100;
  public static final String X_VALUE = "x_point";
  public static final String Y_VALUE = "y_point";
  private static SharedPreferences sharedPrefs;

  static
  {
    int[] arrayOfInt1 = new int[6];
    arrayOfInt1[0] = 1025;
    arrayOfInt1[4] = 1026;
    arrayOfInt1[5] = 1027;
    SHOW_SYNC_INFO = arrayOfInt1;
    int[][] arrayOfInt2 = new int[6][];
    int[] arrayOfInt3 = new int[4];
    arrayOfInt3[0] = 40;
    arrayOfInt3[1] = 260;
    arrayOfInt3[2] = 1;
    arrayOfInt2[0] = arrayOfInt3;
    int[] arrayOfInt4 = new int[4];
    arrayOfInt4[0] = 40;
    arrayOfInt4[1] = 750;
    arrayOfInt4[2] = 1;
    arrayOfInt2[1] = arrayOfInt4;
    arrayOfInt2[2] = { 400, 975, 3, 270 };
    arrayOfInt2[3] = { 400, 45, 2, 90 };
    int[] arrayOfInt5 = new int[4];
    arrayOfInt5[0] = 535;
    arrayOfInt5[1] = 690;
    arrayOfInt5[3] = 180;
    arrayOfInt2[4] = arrayOfInt5;
    int[] arrayOfInt6 = new int[4];
    arrayOfInt6[0] = 535;
    arrayOfInt6[1] = 260;
    arrayOfInt6[3] = 180;
    arrayOfInt2[5] = arrayOfInt6;
    CAR_DEFAULT = arrayOfInt2;
    int[][] arrayOfInt7 = new int[5][];
    int[] arrayOfInt8 = new int[2];
    arrayOfInt8[0] = 1;
    arrayOfInt7[0] = arrayOfInt8;
    int[] arrayOfInt9 = new int[2];
    arrayOfInt9[0] = 1;
    arrayOfInt7[1] = arrayOfInt9;
    int[] arrayOfInt10 = new int[2];
    arrayOfInt10[0] = 1;
    arrayOfInt7[2] = arrayOfInt10;
    int[] arrayOfInt11 = new int[2];
    arrayOfInt11[0] = 1;
    arrayOfInt7[3] = arrayOfInt11;
    int[] arrayOfInt12 = new int[2];
    arrayOfInt12[0] = 1;
    arrayOfInt7[4] = arrayOfInt12;
    TRAFFIC_DEFAULT_MODE = arrayOfInt7;
    int[][] arrayOfInt13 = new int[2][];
    int[] arrayOfInt14 = new int[4];
    arrayOfInt14[0] = 790;
    arrayOfInt14[1] = 890;
    arrayOfInt14[3] = 180;
    arrayOfInt13[0] = arrayOfInt14;
    int[] arrayOfInt15 = new int[4];
    arrayOfInt15[0] = 790;
    arrayOfInt15[1] = 220;
    arrayOfInt15[3] = 180;
    arrayOfInt13[1] = arrayOfInt15;
    PARKINGLOT_ZA = arrayOfInt13;
    ETC_ZA = new int[][] { { 910, 975, 3, 270 }, { 990, 45, 2, 90 } };
    int[][] arrayOfInt16 = new int[2][];
    int[] arrayOfInt17 = new int[4];
    arrayOfInt17[0] = 760;
    arrayOfInt17[1] = 490;
    arrayOfInt17[3] = 180;
    arrayOfInt16[0] = arrayOfInt17;
    int[] arrayOfInt18 = new int[4];
    arrayOfInt18[0] = 840;
    arrayOfInt18[1] = 490;
    arrayOfInt18[3] = 180;
    arrayOfInt16[1] = arrayOfInt18;
    PARKINGLOT = arrayOfInt16;
    int[][] arrayOfInt19 = new int[10][];
    int[] arrayOfInt20 = new int[4];
    arrayOfInt20[0] = 290;
    arrayOfInt20[1] = 500;
    arrayOfInt20[2] = 1;
    arrayOfInt19[0] = arrayOfInt20;
    arrayOfInt19[1] = { 235, 510, 3, 270 };
    int[] arrayOfInt21 = new int[4];
    arrayOfInt21[0] = 290;
    arrayOfInt21[1] = 890;
    arrayOfInt21[2] = 1;
    arrayOfInt19[2] = arrayOfInt21;
    arrayOfInt19[3] = { 235, 975, 3, 270 };
    int[] arrayOfInt22 = new int[4];
    arrayOfInt22[0] = 550;
    arrayOfInt22[1] = 590;
    arrayOfInt22[3] = 180;
    arrayOfInt19[4] = arrayOfInt22;
    arrayOfInt19[5] = { 485, 510, 3, 270 };
    int[] arrayOfInt23 = new int[4];
    arrayOfInt23[0] = 550;
    arrayOfInt23[1] = 120;
    arrayOfInt23[3] = 180;
    arrayOfInt19[6] = arrayOfInt23;
    arrayOfInt19[7] = { 620, 45, 2, 90 };
    int[] arrayOfInt24 = new int[4];
    arrayOfInt24[0] = 790;
    arrayOfInt24[1] = 120;
    arrayOfInt24[3] = 180;
    arrayOfInt19[8] = arrayOfInt24;
    arrayOfInt19[9] = { 870, 45, 2, 90 };
    TRAFFIC_CAR = arrayOfInt19;
    int[][] arrayOfInt25 = new int[10][];
    int[] arrayOfInt26 = new int[4];
    arrayOfInt26[0] = 275;
    arrayOfInt26[1] = 400;
    arrayOfInt26[2] = 1;
    arrayOfInt25[0] = arrayOfInt26;
    arrayOfInt25[1] = { 210, 500, 3, 270 };
    int[] arrayOfInt27 = new int[4];
    arrayOfInt27[0] = 275;
    arrayOfInt27[1] = 870;
    arrayOfInt27[2] = 1;
    arrayOfInt25[2] = arrayOfInt27;
    arrayOfInt25[3] = { 240, 970, 3, 270 };
    int[] arrayOfInt28 = new int[4];
    arrayOfInt28[0] = 535;
    arrayOfInt28[1] = 590;
    arrayOfInt28[3] = 180;
    arrayOfInt25[4] = arrayOfInt28;
    arrayOfInt25[5] = { 485, 500, 3, 270 };
    int[] arrayOfInt29 = new int[4];
    arrayOfInt29[0] = 535;
    arrayOfInt29[1] = 120;
    arrayOfInt29[3] = 180;
    arrayOfInt25[6] = arrayOfInt29;
    arrayOfInt25[7] = { 620, 25, 2, 90 };
    int[] arrayOfInt30 = new int[4];
    arrayOfInt30[0] = 785;
    arrayOfInt30[1] = 120;
    arrayOfInt30[3] = 180;
    arrayOfInt25[8] = arrayOfInt30;
    arrayOfInt25[9] = { 870, 25, 2, 90 };
    TRAFFIC_BUS = arrayOfInt25;
    int[] arrayOfInt31 = new int[4];
    arrayOfInt31[1] = 1;
    arrayOfInt31[2] = 2;
    arrayOfInt31[3] = 3;
    CAR_PATH = arrayOfInt31;
    int[][] arrayOfInt32 = new int[2][];
    int[] arrayOfInt33 = new int[4];
    arrayOfInt33[0] = 535;
    arrayOfInt33[1] = 690;
    arrayOfInt33[3] = 180;
    arrayOfInt32[0] = arrayOfInt33;
    int[] arrayOfInt34 = new int[4];
    arrayOfInt34[0] = 535;
    arrayOfInt34[1] = 260;
    arrayOfInt34[3] = 180;
    arrayOfInt32[1] = arrayOfInt34;
    STATION = arrayOfInt32;
    int[][] arrayOfInt35 = new int[23][];
    int[] arrayOfInt36 = new int[4];
    arrayOfInt36[0] = 40;
    arrayOfInt36[1] = 500;
    arrayOfInt36[2] = 1;
    arrayOfInt35[0] = arrayOfInt36;
    arrayOfInt35[1] = { 240, 975, 3, 270 };
    int[] arrayOfInt37 = new int[4];
    arrayOfInt37[0] = 290;
    arrayOfInt37[1] = 890;
    arrayOfInt37[2] = 1;
    arrayOfInt35[2] = arrayOfInt37;
    int[] arrayOfInt38 = new int[4];
    arrayOfInt38[0] = 550;
    arrayOfInt38[1] = 690;
    arrayOfInt38[3] = 180;
    arrayOfInt35[3] = arrayOfInt38;
    arrayOfInt35[4] = { 240, 500, 3, 270 };
    int[] arrayOfInt39 = new int[4];
    arrayOfInt39[0] = 290;
    arrayOfInt39[1] = 510;
    arrayOfInt39[2] = 1;
    arrayOfInt35[5] = arrayOfInt39;
    arrayOfInt35[6] = { 300, 45, 2, 90 };
    int[] arrayOfInt40 = new int[4];
    arrayOfInt40[0] = 550;
    arrayOfInt40[1] = 260;
    arrayOfInt40[3] = 180;
    arrayOfInt35[7] = arrayOfInt40;
    int[] arrayOfInt41 = new int[4];
    arrayOfInt41[0] = 550;
    arrayOfInt41[1] = 120;
    arrayOfInt41[3] = 180;
    arrayOfInt35[8] = arrayOfInt41;
    arrayOfInt35[9] = { 485, 510, 3, 270 };
    int[] arrayOfInt42 = new int[4];
    arrayOfInt42[0] = 550;
    arrayOfInt42[1] = 590;
    arrayOfInt42[3] = 180;
    arrayOfInt35[10] = arrayOfInt42;
    arrayOfInt35[11] = { 510, 975, 3, 270 };
    arrayOfInt35[12] = { 760, 975, 3, 270 };
    arrayOfInt35[13] = { 910, 975, 3, 270 };
    int[] arrayOfInt43 = new int[4];
    arrayOfInt43[0] = 790;
    arrayOfInt43[1] = 890;
    arrayOfInt43[3] = 180;
    arrayOfInt35[14] = arrayOfInt43;
    int[] arrayOfInt44 = new int[4];
    arrayOfInt44[0] = 760;
    arrayOfInt44[1] = 490;
    arrayOfInt44[3] = 180;
    arrayOfInt35[15] = arrayOfInt44;
    int[] arrayOfInt45 = new int[4];
    arrayOfInt45[0] = 840;
    arrayOfInt45[1] = 490;
    arrayOfInt45[3] = 180;
    arrayOfInt35[16] = arrayOfInt45;
    int[] arrayOfInt46 = new int[4];
    arrayOfInt46[0] = 790;
    arrayOfInt46[1] = 220;
    arrayOfInt46[3] = 180;
    arrayOfInt35[17] = arrayOfInt46;
    arrayOfInt35[18] = { 990, 45, 2, 90 };
    arrayOfInt35[19] = { 870, 45, 2, 90 };
    int[] arrayOfInt47 = new int[4];
    arrayOfInt47[0] = 790;
    arrayOfInt47[1] = 120;
    arrayOfInt47[3] = 180;
    arrayOfInt35[20] = arrayOfInt47;
    arrayOfInt35[21] = { 620, 45, 2, 90 };
    int[] arrayOfInt48 = new int[4];
    arrayOfInt48[0] = 790;
    arrayOfInt48[1] = 625;
    arrayOfInt48[3] = 180;
    arrayOfInt35[22] = arrayOfInt48;
    CAR_LOCATON = arrayOfInt35;
    LOCATION = new int[][] { { 7, 1, 1, 1, 1, 2, 12, 13, 14, 14, 14, 14, 19, 20, 22, 7, 7, 7 }, { 1, 1, 2, 12, 13, 13, 23, 17, 17, 17, 17, 17, 17, 18, 21, 21, 22, 7, 7, 7, 1 }, { 12, 12, 4, 11, 8, 9, 9, 9, 7, 7, 7, 7, 1, 1, 1, 2, 2 }, { 7, 7, 7, 7, 1, 1, 5, 5, 10, 10, 8, 9, 9, 7 }, { 4, 11, 8, 9, 9, 9, 9, 7, 7, 7, 6, 3, 3, 3, 3, 12, 12, 12 }, { 8, 9, 9, 7, 7, 7, 7, 1, 1, 5, 5, 3, 3, 3, 12, 12, 4, 11, 11 } };
    int[][][] arrayOfInt49 = new int[6][][];
    int[][] arrayOfInt50 = new int[18][];
    int[] arrayOfInt51 = new int[4];
    arrayOfInt51[0] = 40;
    arrayOfInt51[1] = 260;
    arrayOfInt51[2] = 1;
    arrayOfInt50[0] = arrayOfInt51;
    int[] arrayOfInt52 = new int[4];
    arrayOfInt52[0] = 40;
    arrayOfInt52[1] = 500;
    arrayOfInt52[2] = 1;
    arrayOfInt50[1] = arrayOfInt52;
    int[] arrayOfInt53 = new int[4];
    arrayOfInt53[0] = 40;
    arrayOfInt53[1] = 750;
    arrayOfInt53[2] = 1;
    arrayOfInt50[2] = arrayOfInt53;
    arrayOfInt50[3] = { 40, 975, 3, 270 };
    arrayOfInt50[4] = { 110, 975, 3, 270 };
    arrayOfInt50[5] = { 240, 975, 3, 270 };
    arrayOfInt50[6] = { 510, 975, 3, 270 };
    arrayOfInt50[7] = { 760, 975, 3, 270 };
    arrayOfInt50[8] = { 910, 975, 3, 270 };
    int[] arrayOfInt54 = new int[4];
    arrayOfInt54[0] = 1040;
    arrayOfInt54[1] = 975;
    arrayOfInt54[3] = 180;
    arrayOfInt50[9] = arrayOfInt54;
    int[] arrayOfInt55 = new int[4];
    arrayOfInt55[0] = 1040;
    arrayOfInt55[1] = 120;
    arrayOfInt55[3] = 180;
    arrayOfInt50[10] = arrayOfInt55;
    arrayOfInt50[11] = { 1040, 45, 2, 90 };
    arrayOfInt50[12] = { 990, 45, 2, 90 };
    arrayOfInt50[13] = { 870, 45, 2, 90 };
    arrayOfInt50[14] = { 620, 45, 2, 90 };
    arrayOfInt50[15] = { 300, 45, 2, 90 };
    arrayOfInt50[16] = { 90, 45, 2, 90 };
    int[] arrayOfInt56 = new int[4];
    arrayOfInt56[0] = 40;
    arrayOfInt56[1] = 45;
    arrayOfInt56[2] = 1;
    arrayOfInt50[17] = arrayOfInt56;
    arrayOfInt49[0] = arrayOfInt50;
    int[][] arrayOfInt57 = new int[23][];
    int[] arrayOfInt58 = new int[4];
    arrayOfInt58[0] = 40;
    arrayOfInt58[1] = 750;
    arrayOfInt58[2] = 1;
    arrayOfInt57[0] = arrayOfInt58;
    arrayOfInt57[1] = { 40, 975, 3, 270 };
    arrayOfInt57[2] = { 240, 975, 3, 270 };
    arrayOfInt57[3] = { 510, 975, 3, 270 };
    arrayOfInt57[4] = { 760, 975, 3, 270 };
    int[] arrayOfInt59 = new int[4];
    arrayOfInt59[0] = 790;
    arrayOfInt59[1] = 975;
    arrayOfInt59[3] = 180;
    arrayOfInt57[5] = arrayOfInt59;
    int[] arrayOfInt60 = new int[4];
    arrayOfInt60[0] = 790;
    arrayOfInt60[1] = 625;
    arrayOfInt60[3] = 180;
    arrayOfInt57[6] = arrayOfInt60;
    int[] arrayOfInt61 = new int[4];
    arrayOfInt61[0] = 820;
    arrayOfInt61[1] = 625;
    arrayOfInt61[3] = 180;
    arrayOfInt57[7] = arrayOfInt61;
    int[] arrayOfInt62 = new int[4];
    arrayOfInt62[0] = 840;
    arrayOfInt62[1] = 490;
    arrayOfInt62[3] = 180;
    arrayOfInt57[8] = arrayOfInt62;
    int[] arrayOfInt63 = new int[4];
    arrayOfInt63[0] = 840;
    arrayOfInt63[1] = 625;
    arrayOfInt63[3] = 180;
    arrayOfInt57[9] = arrayOfInt63;
    int[] arrayOfInt64 = new int[4];
    arrayOfInt64[0] = 840;
    arrayOfInt64[1] = 445;
    arrayOfInt64[3] = 180;
    arrayOfInt57[10] = arrayOfInt64;
    int[] arrayOfInt65 = new int[4];
    arrayOfInt65[0] = 820;
    arrayOfInt65[1] = 445;
    arrayOfInt65[3] = 180;
    arrayOfInt57[11] = arrayOfInt65;
    int[] arrayOfInt66 = new int[4];
    arrayOfInt66[0] = 790;
    arrayOfInt66[1] = 445;
    arrayOfInt66[3] = 180;
    arrayOfInt57[12] = arrayOfInt66;
    int[] arrayOfInt67 = new int[4];
    arrayOfInt67[0] = 790;
    arrayOfInt67[1] = 120;
    arrayOfInt67[3] = 180;
    arrayOfInt57[13] = arrayOfInt67;
    arrayOfInt57[14] = { 790, 45, 2, 90 };
    arrayOfInt57[15] = { 510, 45, 2, 90 };
    arrayOfInt57[16] = { 210, 45, 2, 90 };
    arrayOfInt57[17] = { 90, 45, 2, 90 };
    arrayOfInt57[18] = { 620, 45, 2, 90 };
    arrayOfInt57[19] = { 300, 45, 2, 90 };
    int[] arrayOfInt68 = new int[4];
    arrayOfInt68[0] = 40;
    arrayOfInt68[1] = 45;
    arrayOfInt68[2] = 1;
    arrayOfInt57[20] = arrayOfInt68;
    int[] arrayOfInt69 = new int[4];
    arrayOfInt69[0] = 40;
    arrayOfInt69[1] = 260;
    arrayOfInt69[2] = 1;
    arrayOfInt57[21] = arrayOfInt69;
    int[] arrayOfInt70 = new int[4];
    arrayOfInt70[0] = 40;
    arrayOfInt70[1] = 500;
    arrayOfInt70[2] = 1;
    arrayOfInt57[22] = arrayOfInt70;
    arrayOfInt49[1] = arrayOfInt57;
    int[][] arrayOfInt71 = new int[16][];
    arrayOfInt71[0] = { 400, 975, 3, 270 };
    arrayOfInt71[1] = { 510, 975, 3, 270 };
    int[] arrayOfInt72 = new int[4];
    arrayOfInt72[0] = 550;
    arrayOfInt72[1] = 975;
    arrayOfInt72[3] = 180;
    arrayOfInt71[2] = arrayOfInt72;
    int[] arrayOfInt73 = new int[4];
    arrayOfInt73[0] = 550;
    arrayOfInt73[1] = 690;
    arrayOfInt73[3] = 180;
    arrayOfInt71[3] = arrayOfInt73;
    int[] arrayOfInt74 = new int[4];
    arrayOfInt74[0] = 550;
    arrayOfInt74[1] = 590;
    arrayOfInt74[3] = 180;
    arrayOfInt71[4] = arrayOfInt74;
    int[] arrayOfInt75 = new int[4];
    arrayOfInt75[0] = 550;
    arrayOfInt75[1] = 260;
    arrayOfInt75[3] = 180;
    arrayOfInt71[5] = arrayOfInt75;
    int[] arrayOfInt76 = new int[4];
    arrayOfInt76[0] = 550;
    arrayOfInt76[1] = 120;
    arrayOfInt76[3] = 180;
    arrayOfInt71[6] = arrayOfInt76;
    arrayOfInt71[7] = { 550, 45, 2, 90 };
    arrayOfInt71[8] = { 300, 45, 2, 90 };
    arrayOfInt71[9] = { 150, 45, 2, 90 };
    int[] arrayOfInt77 = new int[4];
    arrayOfInt77[0] = 40;
    arrayOfInt77[1] = 45;
    arrayOfInt77[2] = 1;
    arrayOfInt71[10] = arrayOfInt77;
    int[] arrayOfInt78 = new int[4];
    arrayOfInt78[0] = 40;
    arrayOfInt78[1] = 260;
    arrayOfInt78[2] = 1;
    arrayOfInt71[11] = arrayOfInt78;
    int[] arrayOfInt79 = new int[4];
    arrayOfInt79[0] = 40;
    arrayOfInt79[1] = 500;
    arrayOfInt79[2] = 1;
    arrayOfInt71[12] = arrayOfInt79;
    int[] arrayOfInt80 = new int[4];
    arrayOfInt80[0] = 40;
    arrayOfInt80[1] = 760;
    arrayOfInt80[2] = 1;
    arrayOfInt71[13] = arrayOfInt80;
    arrayOfInt71[14] = { 40, 975, 3, 270 };
    arrayOfInt71[15] = { 240, 975, 3, 270 };
    arrayOfInt49[2] = arrayOfInt71;
    int[][] arrayOfInt81 = new int[14][];
    arrayOfInt81[0] = { 400, 45, 2, 90 };
    arrayOfInt81[1] = { 200, 45, 2, 90 };
    int[] arrayOfInt82 = new int[4];
    arrayOfInt82[0] = 40;
    arrayOfInt82[1] = 45;
    arrayOfInt82[2] = 1;
    arrayOfInt81[2] = arrayOfInt82;
    int[] arrayOfInt83 = new int[4];
    arrayOfInt83[0] = 40;
    arrayOfInt83[1] = 200;
    arrayOfInt83[2] = 1;
    arrayOfInt81[3] = arrayOfInt83;
    int[] arrayOfInt84 = new int[4];
    arrayOfInt84[0] = 40;
    arrayOfInt84[1] = 500;
    arrayOfInt84[2] = 1;
    arrayOfInt81[4] = arrayOfInt84;
    arrayOfInt81[5] = { 40, 510, 3, 270 };
    arrayOfInt81[6] = { 240, 510, 3, 270 };
    arrayOfInt81[7] = { 400, 510, 3, 270 };
    arrayOfInt81[8] = { 485, 510, 3, 270 };
    int[] arrayOfInt85 = new int[4];
    arrayOfInt85[0] = 550;
    arrayOfInt85[1] = 510;
    arrayOfInt85[3] = 180;
    arrayOfInt81[9] = arrayOfInt85;
    int[] arrayOfInt86 = new int[4];
    arrayOfInt86[0] = 550;
    arrayOfInt86[1] = 260;
    arrayOfInt86[3] = 180;
    arrayOfInt81[10] = arrayOfInt86;
    int[] arrayOfInt87 = new int[4];
    arrayOfInt87[0] = 550;
    arrayOfInt87[1] = 120;
    arrayOfInt87[3] = 180;
    arrayOfInt81[11] = arrayOfInt87;
    arrayOfInt81[12] = { 550, 45, 2, 90 };
    arrayOfInt81[13] = { 300, 45, 2, 90 };
    arrayOfInt49[3] = arrayOfInt81;
    int[][] arrayOfInt88 = new int[18][];
    int[] arrayOfInt89 = new int[4];
    arrayOfInt89[0] = 535;
    arrayOfInt89[1] = 690;
    arrayOfInt89[3] = 180;
    arrayOfInt88[0] = arrayOfInt89;
    int[] arrayOfInt90 = new int[4];
    arrayOfInt90[0] = 535;
    arrayOfInt90[1] = 590;
    arrayOfInt90[3] = 180;
    arrayOfInt88[1] = arrayOfInt90;
    int[] arrayOfInt91 = new int[4];
    arrayOfInt91[0] = 535;
    arrayOfInt91[1] = 260;
    arrayOfInt91[3] = 180;
    arrayOfInt88[2] = arrayOfInt91;
    int[] arrayOfInt92 = new int[4];
    arrayOfInt92[0] = 535;
    arrayOfInt92[1] = 120;
    arrayOfInt92[3] = 180;
    arrayOfInt88[3] = arrayOfInt92;
    int[] arrayOfInt93 = new int[4];
    arrayOfInt93[0] = 535;
    arrayOfInt93[1] = 25;
    arrayOfInt93[3] = 180;
    arrayOfInt88[4] = arrayOfInt93;
    arrayOfInt88[5] = { 535, 25, 2, 90 };
    arrayOfInt88[6] = { 380, 25, 2, 90 };
    arrayOfInt88[7] = { 300, 25, 2, 90 };
    int[] arrayOfInt94 = new int[4];
    arrayOfInt94[0] = 275;
    arrayOfInt94[1] = 25;
    arrayOfInt94[2] = 1;
    arrayOfInt88[8] = arrayOfInt94;
    int[] arrayOfInt95 = new int[4];
    arrayOfInt95[0] = 275;
    arrayOfInt95[1] = 200;
    arrayOfInt95[2] = 1;
    arrayOfInt88[9] = arrayOfInt95;
    int[] arrayOfInt96 = new int[4];
    arrayOfInt96[0] = 275;
    arrayOfInt96[1] = 510;
    arrayOfInt96[2] = 1;
    arrayOfInt88[10] = arrayOfInt96;
    int[] arrayOfInt97 = new int[4];
    arrayOfInt97[0] = 275;
    arrayOfInt97[1] = 890;
    arrayOfInt97[2] = 1;
    arrayOfInt88[11] = arrayOfInt97;
    arrayOfInt88[12] = { 280, 965, 3, 270 };
    arrayOfInt88[13] = { 400, 965, 3, 270 };
    arrayOfInt88[14] = { 435, 965, 3, 270 };
    arrayOfInt88[15] = { 510, 965, 3, 270 };
    int[] arrayOfInt98 = new int[4];
    arrayOfInt98[0] = 535;
    arrayOfInt98[1] = 965;
    arrayOfInt98[3] = 180;
    arrayOfInt88[16] = arrayOfInt98;
    int[] arrayOfInt99 = new int[4];
    arrayOfInt99[0] = 535;
    arrayOfInt99[1] = 865;
    arrayOfInt99[3] = 180;
    arrayOfInt88[17] = arrayOfInt99;
    arrayOfInt49[4] = arrayOfInt88;
    int[][] arrayOfInt100 = new int[19][];
    int[] arrayOfInt101 = new int[4];
    arrayOfInt101[0] = 535;
    arrayOfInt101[1] = 260;
    arrayOfInt101[3] = 180;
    arrayOfInt100[0] = arrayOfInt101;
    int[] arrayOfInt102 = new int[4];
    arrayOfInt102[0] = 535;
    arrayOfInt102[1] = 120;
    arrayOfInt102[3] = 180;
    arrayOfInt100[1] = arrayOfInt102;
    arrayOfInt100[2] = { 535, 25, 2, 90 };
    arrayOfInt100[3] = { 300, 25, 2, 90 };
    arrayOfInt100[4] = { 200, 25, 2, 90 };
    int[] arrayOfInt103 = new int[4];
    arrayOfInt103[0] = 25;
    arrayOfInt103[1] = 25;
    arrayOfInt103[2] = 1;
    arrayOfInt100[5] = arrayOfInt103;
    int[] arrayOfInt104 = new int[4];
    arrayOfInt104[0] = 25;
    arrayOfInt104[1] = 200;
    arrayOfInt104[2] = 1;
    arrayOfInt100[6] = arrayOfInt104;
    int[] arrayOfInt105 = new int[4];
    arrayOfInt105[0] = 25;
    arrayOfInt105[1] = 500;
    arrayOfInt105[2] = 1;
    arrayOfInt100[7] = arrayOfInt105;
    arrayOfInt100[8] = { 30, 500, 3, 270 };
    arrayOfInt100[9] = { 240, 500, 3, 270 };
    int[] arrayOfInt106 = new int[4];
    arrayOfInt106[0] = 275;
    arrayOfInt106[1] = 500;
    arrayOfInt106[2] = 1;
    arrayOfInt100[10] = arrayOfInt106;
    int[] arrayOfInt107 = new int[4];
    arrayOfInt107[0] = 275;
    arrayOfInt107[1] = 890;
    arrayOfInt107[2] = 1;
    arrayOfInt100[11] = arrayOfInt107;
    arrayOfInt100[12] = { 280, 965, 3, 270 };
    arrayOfInt100[13] = { 400, 965, 3, 270 };
    arrayOfInt100[14] = { 510, 965, 3, 270 };
    int[] arrayOfInt108 = new int[4];
    arrayOfInt108[0] = 535;
    arrayOfInt108[1] = 965;
    arrayOfInt108[3] = 180;
    arrayOfInt100[15] = arrayOfInt108;
    int[] arrayOfInt109 = new int[4];
    arrayOfInt109[0] = 535;
    arrayOfInt109[1] = 690;
    arrayOfInt109[3] = 180;
    arrayOfInt100[16] = arrayOfInt109;
    int[] arrayOfInt110 = new int[4];
    arrayOfInt110[0] = 535;
    arrayOfInt110[1] = 590;
    arrayOfInt110[3] = 180;
    arrayOfInt100[17] = arrayOfInt110;
    int[] arrayOfInt111 = new int[4];
    arrayOfInt111[0] = 535;
    arrayOfInt111[1] = 540;
    arrayOfInt111[3] = 180;
    arrayOfInt100[18] = arrayOfInt111;
    arrayOfInt49[5] = arrayOfInt100;
    CAR_RECT = arrayOfInt49;
    int[][][] arrayOfInt112 = new int[6][][];
    int[][] arrayOfInt113 = new int[18][];
    int[] arrayOfInt114 = new int[4];
    arrayOfInt114[0] = 40;
    arrayOfInt114[1] = 260;
    arrayOfInt114[2] = 1;
    arrayOfInt113[0] = arrayOfInt114;
    int[] arrayOfInt115 = new int[4];
    arrayOfInt115[0] = 40;
    arrayOfInt115[1] = 500;
    arrayOfInt115[2] = 1;
    arrayOfInt113[1] = arrayOfInt115;
    int[] arrayOfInt116 = new int[4];
    arrayOfInt116[0] = 40;
    arrayOfInt116[1] = 750;
    arrayOfInt116[2] = 1;
    arrayOfInt113[2] = arrayOfInt116;
    arrayOfInt113[3] = { 40, 975, 3, 270 };
    arrayOfInt113[4] = { 110, 975, 3, 270 };
    arrayOfInt113[5] = { 240, 975, 3, 270 };
    arrayOfInt113[6] = { 510, 975, 3, 270 };
    arrayOfInt113[7] = { 760, 975, 3, 270 };
    arrayOfInt113[8] = { 910, 975, 3, 270 };
    int[] arrayOfInt117 = new int[4];
    arrayOfInt117[0] = 1040;
    arrayOfInt117[1] = 975;
    arrayOfInt117[3] = 180;
    arrayOfInt113[9] = arrayOfInt117;
    int[] arrayOfInt118 = new int[4];
    arrayOfInt118[0] = 1040;
    arrayOfInt118[1] = 120;
    arrayOfInt118[3] = 180;
    arrayOfInt113[10] = arrayOfInt118;
    arrayOfInt113[11] = { 1040, 45, 2, 90 };
    arrayOfInt113[12] = { 990, 45, 2, 90 };
    arrayOfInt113[13] = { 870, 45, 2, 90 };
    arrayOfInt113[14] = { 620, 45, 2, 90 };
    arrayOfInt113[15] = { 300, 45, 2, 90 };
    arrayOfInt113[16] = { 90, 45, 2, 90 };
    int[] arrayOfInt119 = new int[4];
    arrayOfInt119[0] = 40;
    arrayOfInt119[1] = 45;
    arrayOfInt119[2] = 1;
    arrayOfInt113[17] = arrayOfInt119;
    arrayOfInt112[0] = arrayOfInt113;
    int[][] arrayOfInt120 = new int[15][];
    int[] arrayOfInt121 = new int[4];
    arrayOfInt121[0] = 290;
    arrayOfInt121[1] = 45;
    arrayOfInt121[2] = 1;
    arrayOfInt120[0] = arrayOfInt121;
    int[] arrayOfInt122 = new int[4];
    arrayOfInt122[0] = 290;
    arrayOfInt122[1] = 260;
    arrayOfInt122[2] = 1;
    arrayOfInt120[1] = arrayOfInt122;
    int[] arrayOfInt123 = new int[4];
    arrayOfInt123[0] = 290;
    arrayOfInt123[1] = 500;
    arrayOfInt123[2] = 1;
    arrayOfInt120[2] = arrayOfInt123;
    int[] arrayOfInt124 = new int[4];
    arrayOfInt124[0] = 290;
    arrayOfInt124[1] = 750;
    arrayOfInt124[2] = 1;
    arrayOfInt120[3] = arrayOfInt124;
    arrayOfInt120[4] = { 290, 975, 3, 270 };
    arrayOfInt120[5] = { 510, 975, 3, 270 };
    arrayOfInt120[6] = { 760, 975, 3, 270 };
    arrayOfInt120[7] = { 910, 975, 3, 270 };
    int[] arrayOfInt125 = new int[4];
    arrayOfInt125[0] = 1040;
    arrayOfInt125[1] = 975;
    arrayOfInt125[3] = 180;
    arrayOfInt120[8] = arrayOfInt125;
    int[] arrayOfInt126 = new int[4];
    arrayOfInt126[0] = 1040;
    arrayOfInt126[1] = 120;
    arrayOfInt126[3] = 180;
    arrayOfInt120[9] = arrayOfInt126;
    arrayOfInt120[10] = { 1040, 45, 2, 90 };
    arrayOfInt120[11] = { 990, 45, 2, 90 };
    arrayOfInt120[12] = { 870, 45, 2, 90 };
    arrayOfInt120[13] = { 620, 45, 2, 90 };
    arrayOfInt120[14] = { 300, 45, 2, 90 };
    arrayOfInt112[1] = arrayOfInt120;
    int[][] arrayOfInt127 = new int[17][];
    arrayOfInt127[0] = { 290, 975, 3, 270 };
    arrayOfInt127[1] = { 510, 975, 3, 270 };
    int[] arrayOfInt128 = new int[4];
    arrayOfInt128[0] = 550;
    arrayOfInt128[1] = 975;
    arrayOfInt128[3] = 180;
    arrayOfInt127[2] = arrayOfInt128;
    int[] arrayOfInt129 = new int[4];
    arrayOfInt129[0] = 550;
    arrayOfInt129[1] = 690;
    arrayOfInt129[3] = 180;
    arrayOfInt127[3] = arrayOfInt129;
    int[] arrayOfInt130 = new int[4];
    arrayOfInt130[0] = 550;
    arrayOfInt130[1] = 590;
    arrayOfInt130[3] = 180;
    arrayOfInt127[4] = arrayOfInt130;
    int[] arrayOfInt131 = new int[4];
    arrayOfInt131[0] = 550;
    arrayOfInt131[1] = 260;
    arrayOfInt131[3] = 180;
    arrayOfInt127[5] = arrayOfInt131;
    int[] arrayOfInt132 = new int[4];
    arrayOfInt132[0] = 550;
    arrayOfInt132[1] = 120;
    arrayOfInt132[3] = 180;
    arrayOfInt127[6] = arrayOfInt132;
    arrayOfInt127[7] = { 550, 45, 2, 90 };
    arrayOfInt127[8] = { 300, 45, 2, 90 };
    arrayOfInt127[9] = { 150, 45, 2, 90 };
    int[] arrayOfInt133 = new int[4];
    arrayOfInt133[0] = 40;
    arrayOfInt133[1] = 45;
    arrayOfInt133[2] = 1;
    arrayOfInt127[10] = arrayOfInt133;
    int[] arrayOfInt134 = new int[4];
    arrayOfInt134[0] = 40;
    arrayOfInt134[1] = 260;
    arrayOfInt134[2] = 1;
    arrayOfInt127[11] = arrayOfInt134;
    int[] arrayOfInt135 = new int[4];
    arrayOfInt135[0] = 40;
    arrayOfInt135[1] = 500;
    arrayOfInt135[2] = 1;
    arrayOfInt127[12] = arrayOfInt135;
    arrayOfInt127[13] = { 40, 510, 3, 270 };
    arrayOfInt127[14] = { 240, 510, 3, 270 };
    int[] arrayOfInt136 = new int[4];
    arrayOfInt136[0] = 290;
    arrayOfInt136[1] = 510;
    arrayOfInt136[2] = 1;
    arrayOfInt127[15] = arrayOfInt136;
    int[] arrayOfInt137 = new int[4];
    arrayOfInt137[0] = 290;
    arrayOfInt137[1] = 890;
    arrayOfInt137[2] = 1;
    arrayOfInt127[16] = arrayOfInt137;
    arrayOfInt112[2] = arrayOfInt127;
    int[][] arrayOfInt138 = new int[14][];
    arrayOfInt138[0] = { 400, 45, 2, 90 };
    arrayOfInt138[1] = { 200, 45, 2, 90 };
    int[] arrayOfInt139 = new int[4];
    arrayOfInt139[0] = 40;
    arrayOfInt139[1] = 45;
    arrayOfInt139[2] = 1;
    arrayOfInt138[2] = arrayOfInt139;
    int[] arrayOfInt140 = new int[4];
    arrayOfInt140[0] = 40;
    arrayOfInt140[1] = 200;
    arrayOfInt140[2] = 1;
    arrayOfInt138[3] = arrayOfInt140;
    int[] arrayOfInt141 = new int[4];
    arrayOfInt141[0] = 40;
    arrayOfInt141[1] = 500;
    arrayOfInt141[2] = 1;
    arrayOfInt138[4] = arrayOfInt141;
    arrayOfInt138[5] = { 40, 510, 3, 270 };
    arrayOfInt138[6] = { 240, 510, 3, 270 };
    arrayOfInt138[7] = { 400, 510, 3, 270 };
    arrayOfInt138[8] = { 485, 510, 3, 270 };
    int[] arrayOfInt142 = new int[4];
    arrayOfInt142[0] = 550;
    arrayOfInt142[1] = 510;
    arrayOfInt142[3] = 180;
    arrayOfInt138[9] = arrayOfInt142;
    int[] arrayOfInt143 = new int[4];
    arrayOfInt143[0] = 550;
    arrayOfInt143[1] = 260;
    arrayOfInt143[3] = 180;
    arrayOfInt138[10] = arrayOfInt143;
    int[] arrayOfInt144 = new int[4];
    arrayOfInt144[0] = 550;
    arrayOfInt144[1] = 120;
    arrayOfInt144[3] = 180;
    arrayOfInt138[11] = arrayOfInt144;
    arrayOfInt138[12] = { 550, 45, 2, 90 };
    arrayOfInt138[13] = { 300, 45, 2, 90 };
    arrayOfInt112[3] = arrayOfInt138;
    int[][] arrayOfInt145 = new int[18][];
    int[] arrayOfInt146 = new int[4];
    arrayOfInt146[0] = 535;
    arrayOfInt146[1] = 690;
    arrayOfInt146[3] = 180;
    arrayOfInt145[0] = arrayOfInt146;
    int[] arrayOfInt147 = new int[4];
    arrayOfInt147[0] = 535;
    arrayOfInt147[1] = 590;
    arrayOfInt147[3] = 180;
    arrayOfInt145[1] = arrayOfInt147;
    int[] arrayOfInt148 = new int[4];
    arrayOfInt148[0] = 535;
    arrayOfInt148[1] = 260;
    arrayOfInt148[3] = 180;
    arrayOfInt145[2] = arrayOfInt148;
    int[] arrayOfInt149 = new int[4];
    arrayOfInt149[0] = 535;
    arrayOfInt149[1] = 120;
    arrayOfInt149[3] = 180;
    arrayOfInt145[3] = arrayOfInt149;
    int[] arrayOfInt150 = new int[4];
    arrayOfInt150[0] = 535;
    arrayOfInt150[1] = 25;
    arrayOfInt150[3] = 180;
    arrayOfInt145[4] = arrayOfInt150;
    arrayOfInt145[5] = { 535, 25, 2, 90 };
    arrayOfInt145[6] = { 380, 25, 2, 90 };
    arrayOfInt145[7] = { 300, 25, 2, 90 };
    int[] arrayOfInt151 = new int[4];
    arrayOfInt151[0] = 275;
    arrayOfInt151[1] = 25;
    arrayOfInt151[2] = 1;
    arrayOfInt145[8] = arrayOfInt151;
    int[] arrayOfInt152 = new int[4];
    arrayOfInt152[0] = 275;
    arrayOfInt152[1] = 200;
    arrayOfInt152[2] = 1;
    arrayOfInt145[9] = arrayOfInt152;
    int[] arrayOfInt153 = new int[4];
    arrayOfInt153[0] = 275;
    arrayOfInt153[1] = 510;
    arrayOfInt153[2] = 1;
    arrayOfInt145[10] = arrayOfInt153;
    int[] arrayOfInt154 = new int[4];
    arrayOfInt154[0] = 275;
    arrayOfInt154[1] = 890;
    arrayOfInt154[2] = 1;
    arrayOfInt145[11] = arrayOfInt154;
    arrayOfInt145[12] = { 280, 965, 3, 270 };
    arrayOfInt145[13] = { 400, 965, 3, 270 };
    arrayOfInt145[14] = { 435, 965, 3, 270 };
    arrayOfInt145[15] = { 510, 965, 3, 270 };
    int[] arrayOfInt155 = new int[4];
    arrayOfInt155[0] = 535;
    arrayOfInt155[1] = 965;
    arrayOfInt155[3] = 180;
    arrayOfInt145[16] = arrayOfInt155;
    int[] arrayOfInt156 = new int[4];
    arrayOfInt156[0] = 535;
    arrayOfInt156[1] = 865;
    arrayOfInt156[3] = 180;
    arrayOfInt145[17] = arrayOfInt156;
    arrayOfInt112[4] = arrayOfInt145;
    int[][] arrayOfInt157 = new int[19][];
    int[] arrayOfInt158 = new int[4];
    arrayOfInt158[0] = 535;
    arrayOfInt158[1] = 260;
    arrayOfInt158[3] = 180;
    arrayOfInt157[0] = arrayOfInt158;
    int[] arrayOfInt159 = new int[4];
    arrayOfInt159[0] = 535;
    arrayOfInt159[1] = 120;
    arrayOfInt159[3] = 180;
    arrayOfInt157[1] = arrayOfInt159;
    arrayOfInt157[2] = { 535, 25, 2, 90 };
    arrayOfInt157[3] = { 300, 25, 2, 90 };
    arrayOfInt157[4] = { 200, 25, 2, 90 };
    int[] arrayOfInt160 = new int[4];
    arrayOfInt160[0] = 25;
    arrayOfInt160[1] = 25;
    arrayOfInt160[2] = 1;
    arrayOfInt157[5] = arrayOfInt160;
    int[] arrayOfInt161 = new int[4];
    arrayOfInt161[0] = 25;
    arrayOfInt161[1] = 200;
    arrayOfInt161[2] = 1;
    arrayOfInt157[6] = arrayOfInt161;
    int[] arrayOfInt162 = new int[4];
    arrayOfInt162[0] = 25;
    arrayOfInt162[1] = 500;
    arrayOfInt162[2] = 1;
    arrayOfInt157[7] = arrayOfInt162;
    arrayOfInt157[8] = { 30, 500, 3, 270 };
    arrayOfInt157[9] = { 240, 500, 3, 270 };
    int[] arrayOfInt163 = new int[4];
    arrayOfInt163[0] = 275;
    arrayOfInt163[1] = 510;
    arrayOfInt163[2] = 1;
    arrayOfInt157[10] = arrayOfInt163;
    int[] arrayOfInt164 = new int[4];
    arrayOfInt164[0] = 275;
    arrayOfInt164[1] = 890;
    arrayOfInt164[2] = 1;
    arrayOfInt157[11] = arrayOfInt164;
    arrayOfInt157[12] = { 280, 965, 3, 270 };
    arrayOfInt157[13] = { 400, 965, 3, 270 };
    arrayOfInt157[14] = { 510, 965, 3, 270 };
    int[] arrayOfInt165 = new int[4];
    arrayOfInt165[0] = 535;
    arrayOfInt165[1] = 965;
    arrayOfInt165[3] = 180;
    arrayOfInt157[15] = arrayOfInt165;
    int[] arrayOfInt166 = new int[4];
    arrayOfInt166[0] = 535;
    arrayOfInt166[1] = 690;
    arrayOfInt166[3] = 180;
    arrayOfInt157[16] = arrayOfInt166;
    int[] arrayOfInt167 = new int[4];
    arrayOfInt167[0] = 535;
    arrayOfInt167[1] = 590;
    arrayOfInt167[3] = 180;
    arrayOfInt157[17] = arrayOfInt167;
    int[] arrayOfInt168 = new int[4];
    arrayOfInt168[0] = 535;
    arrayOfInt168[1] = 540;
    arrayOfInt168[3] = 180;
    arrayOfInt157[18] = arrayOfInt168;
    arrayOfInt112[5] = arrayOfInt157;
    CAR_RECT_SYNC = arrayOfInt112;
  }

  public static int getCarNumber(Context paramContext)
  {
    sharedPrefs = paramContext.getSharedPreferences("car_traffic_info", 0);
    return sharedPrefs.getInt("car_num", 1);
  }

  public static void sendMsgToHandle(Handler paramHandler, int paramInt1, Map<String, Integer> paramMap, int paramInt2)
  {
    Message localMessage = paramHandler.obtainMessage();
    localMessage.what = paramInt1;
    Bundle localBundle = new Bundle();
    localBundle.clear();
    Iterator localIterator = paramMap.keySet().iterator();
    while (true)
    {
      if (!localIterator.hasNext())
      {
        localMessage.setData(localBundle);
        paramHandler.sendMessageDelayed(localMessage, paramInt2);
        return;
      }
      Object localObject = localIterator.next();
      localBundle.putInt(localObject.toString(), ((Integer)paramMap.get(localObject)).intValue());
    }
  }
}

/* Location:           C:\Users\chengpx\Desktop\Electronic_traffic_dex2jar.jar
 * Qualified Name:     com.ut.electronictraffic.interfaces.Utils
 * JD-Core Version:    0.6.0
 */