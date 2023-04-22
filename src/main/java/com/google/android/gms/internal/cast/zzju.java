package com.google.android.gms.internal.cast;

/* loaded from: classes.dex */
public enum zzju implements t9.n1 {
    DEVELOPER_FEATURE_FLAG_UNKNOWN(0),
    CAF_CAST_BUTTON(1),
    CAF_EXPANDED_CONTROLLER(2),
    CAF_MINI_CONTROLLER(3),
    CAF_CONTAINER_CONTROLLER(4),
    CAST_CONTEXT(5),
    IMAGE_CACHE(6),
    IMAGE_PICKER(7),
    AD_BREAK_PARSER(8),
    UI_STYLE(9),
    HARDWARE_VOLUME_BUTTON(10),
    NON_CAST_DEVICE_PROVIDER(11),
    PAUSE_CONTROLLER(12),
    SEEK_CONTROLLER(13),
    STREAM_VOLUME(14),
    UI_MEDIA_CONTROLLER(15),
    PLAYBACK_RATE_CONTROLLER(16),
    PRECACHE(17),
    INSTRUCTIONS_VIEW(18),
    OPTION_SUSPEND_SESSIONS_WHEN_BACKGROUNDED(19),
    OPTION_STOP_RECEIVER_APPLICATION_WHEN_ENDING_SESSION(20),
    OPTION_DISABLE_DISCOVERY_AUTOSTART(21),
    OPTION_DISABLE_ANALYTICS_LOGGING(22),
    OPTION_PHYSICAL_VOLUME_BUTTONS_WILL_CONTROL_DEVICE_VOLUME(23),
    CAF_EXPANDED_CONTROLLER_HIDE_STREAM_POSITION_CONTROLS_FOR_LIVE_CONTENT(24),
    CAF_EXPANDED_CONTROLLER_WITH_LIVE_CONTENT(25),
    REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_OPTIONS(26),
    REMOTE_MEDIA_CLIENT_QUEUE_LOAD_ITEMS_WITH_OPTIONS(27),
    REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_LOAD_REQUEST_DATA(28),
    LAUNCH_OPTION_ANDROID_RECEIVER_COMPATIBLE(29),
    CAST_CONTEXT_SET_LAUNCH_CREDENTIALS_DATA(30),
    START_DISCOVERY_AFTER_FIRST_TAP_ON_CAST_BUTTON(31),
    CAST_UNAVAILABLE_BUTTON_VISIBLE(32),
    CAST_DEFAULT_MEDIA_ROUTER_DIALOG(33),
    CAST_CUSTOM_MEDIA_ROUTER_DIALOG(34),
    CAST_OUTPUT_SWITCHER_ENABLED(35),
    CAST_TRANSFER_TO_LOCAL_ENABLED(36),
    CAST_BUTTON_IS_TRIGGERED_DEFAULT_CAST_DIALOG_FALSE(37),
    CAST_BUTTON_DELEGATE(38),
    CAST_BUTTON_DELEGATE_PRESENT_LNA_PERMISSION_CUSTOM_DIALOG(39),
    CAST_BUTTON_DELEGATE_PRESENT_CAST_STATE_CUSTOM_DIALOG(40),
    CAST_TRANSFER_TO_LOCAL_USED(41),
    MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_TO_STRING(42),
    MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM(43),
    HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_TO_STRING(44),
    HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM(45),
    HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_TO_STRING(46),
    HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_STRING_TO_ENUM(47),
    CAST_SLIDER_SET_AD_BLOCK_POSITIONS(48);
    
    private final int zzZ;

    zzju(int i10) {
        this.zzZ = i10;
    }

    public static zzju b(int i10) {
        switch (i10) {
            case 0:
                return DEVELOPER_FEATURE_FLAG_UNKNOWN;
            case 1:
                return CAF_CAST_BUTTON;
            case 2:
                return CAF_EXPANDED_CONTROLLER;
            case 3:
                return CAF_MINI_CONTROLLER;
            case 4:
                return CAF_CONTAINER_CONTROLLER;
            case 5:
                return CAST_CONTEXT;
            case 6:
                return IMAGE_CACHE;
            case 7:
                return IMAGE_PICKER;
            case 8:
                return AD_BREAK_PARSER;
            case 9:
                return UI_STYLE;
            case 10:
                return HARDWARE_VOLUME_BUTTON;
            case 11:
                return NON_CAST_DEVICE_PROVIDER;
            case 12:
                return PAUSE_CONTROLLER;
            case 13:
                return SEEK_CONTROLLER;
            case 14:
                return STREAM_VOLUME;
            case 15:
                return UI_MEDIA_CONTROLLER;
            case 16:
                return PLAYBACK_RATE_CONTROLLER;
            case 17:
                return PRECACHE;
            case 18:
                return INSTRUCTIONS_VIEW;
            case 19:
                return OPTION_SUSPEND_SESSIONS_WHEN_BACKGROUNDED;
            case 20:
                return OPTION_STOP_RECEIVER_APPLICATION_WHEN_ENDING_SESSION;
            case 21:
                return OPTION_DISABLE_DISCOVERY_AUTOSTART;
            case 22:
                return OPTION_DISABLE_ANALYTICS_LOGGING;
            case 23:
                return OPTION_PHYSICAL_VOLUME_BUTTONS_WILL_CONTROL_DEVICE_VOLUME;
            case 24:
                return CAF_EXPANDED_CONTROLLER_HIDE_STREAM_POSITION_CONTROLS_FOR_LIVE_CONTENT;
            case 25:
                return CAF_EXPANDED_CONTROLLER_WITH_LIVE_CONTENT;
            case 26:
                return REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_OPTIONS;
            case 27:
                return REMOTE_MEDIA_CLIENT_QUEUE_LOAD_ITEMS_WITH_OPTIONS;
            case 28:
                return REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_LOAD_REQUEST_DATA;
            case 29:
                return LAUNCH_OPTION_ANDROID_RECEIVER_COMPATIBLE;
            case 30:
                return CAST_CONTEXT_SET_LAUNCH_CREDENTIALS_DATA;
            case 31:
                return START_DISCOVERY_AFTER_FIRST_TAP_ON_CAST_BUTTON;
            case 32:
                return CAST_UNAVAILABLE_BUTTON_VISIBLE;
            case 33:
                return CAST_DEFAULT_MEDIA_ROUTER_DIALOG;
            case 34:
                return CAST_CUSTOM_MEDIA_ROUTER_DIALOG;
            case 35:
                return CAST_OUTPUT_SWITCHER_ENABLED;
            case 36:
                return CAST_TRANSFER_TO_LOCAL_ENABLED;
            case 37:
                return CAST_BUTTON_IS_TRIGGERED_DEFAULT_CAST_DIALOG_FALSE;
            case 38:
                return CAST_BUTTON_DELEGATE;
            case 39:
                return CAST_BUTTON_DELEGATE_PRESENT_LNA_PERMISSION_CUSTOM_DIALOG;
            case 40:
                return CAST_BUTTON_DELEGATE_PRESENT_CAST_STATE_CUSTOM_DIALOG;
            case 41:
                return CAST_TRANSFER_TO_LOCAL_USED;
            case 42:
                return MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_TO_STRING;
            case 43:
                return MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM;
            case 44:
                return HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_TO_STRING;
            case 45:
                return HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM;
            case 46:
                return HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_TO_STRING;
            case 47:
                return HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_STRING_TO_ENUM;
            case 48:
                return CAST_SLIDER_SET_AD_BLOCK_POSITIONS;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzZ);
    }

    public final int zza() {
        return this.zzZ;
    }
}
