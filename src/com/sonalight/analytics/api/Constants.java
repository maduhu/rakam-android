package com.sonalight.analytics.api;

public class Constants {
  public static final String EVENT_LOG_URL = "http://analytics.snlt.co/event/";

  public static final String PACKAGE_NAME = Constants.class.getPackage().getName();

  public static final String DATABASE_NAME = PACKAGE_NAME;
  public static final int DATABASE_VERSION = 1;

  public static final String EVENT_TABLE_NAME = "events";

  public static final String ID_FIELD = "id";
  public static final String EVENT_FIELD = "event";
  public static final String[] TABLE_FIELD_NAMES = { ID_FIELD, EVENT_FIELD };

  public static final int EVENT_BATCH_SIZE = 10;

  public static final String PREFKEY_LAST_SESSION_TIME = PACKAGE_NAME + ".previousSessionEnd";
  public static final String PREFKEY_LAST_SESSION_ID = PACKAGE_NAME + ".previousSessionId";

  public static final long MIN_TIME_BETWEEN_SESSIONS_MILLIS = 10 * 1000;

  public static final String PERMISSION_FINE_LOCATION = "android.permission.ACCESS_FINE_LOCATION";
  public static final String PERMISSION_COARSE_LOCATION = "android.permission.ACCESS_COARSE_LOCATION";

}