package com.example.psp.constants;

public class Constants {

    /*Tags*/
    public static final String TAG_FCM = "FCM";
    public static final String TAG_HANDLE_NOTIFICATION_WORKER = "HandleNotification";
    public static final String TAG_CLEAR_NOTIFICATIONS_WORKER = "ClearNotifications";

    /*Titles*/
    public static final String TITLE_HOME = "Home";
    public static final String TITLE_NOTIFICATION = "Notification";
    public static final String TITLE_ABOUT = "About";

    public static final String INTENT_ERROR_MESSAGE = "intentErrorMessage";
    public static final String IS_BOARDING_COMLETE = "isOnboardingComplete";
    public static final String SPLASH_PREFS = "SplashPrefs";
    public static final String NOTIFICATION_CHANNEL_ID = "8147417170";
    public static final String NOTIFICATION_CHANNEL_NAME = "MyChannel";
    public static final String NOTIFICATION_CHANNEL_DESCRIPTION = "MyChannel Description";

    public static final String KEY_TITLE = "title";
    public static final String KEY_BODY = "body";
    public static final String KEY_NOTIFICATION_ENTITY = "notificationEntity";
    public static final String KEY_CONTEXT = "context";
    public static final String KEY_PENDING_ACTIVITY_CLASS_NAME = "pendingActivityClassName";


    public static final String DB_FILE_NAME = "AppDatabase";
    public static final Integer NOTIFICATION_CLEAN_UP_DAYS = 10;
    public static final Long NOTIFICATION_CLEAN_UP_TIME = 86400000L * Long.valueOf(NOTIFICATION_CLEAN_UP_DAYS);

    /*FCM*/
    public static String FCM_TOKEN = "";
    public static final String FCM_TOPIC = "MyTopic";
}
