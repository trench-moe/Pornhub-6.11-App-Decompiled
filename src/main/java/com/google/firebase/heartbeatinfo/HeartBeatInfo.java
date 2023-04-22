package com.google.firebase.heartbeatinfo;

/* loaded from: classes.dex */
public interface HeartBeatInfo {

    /* loaded from: classes.dex */
    public enum HeartBeat {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        
        private final int code;

        HeartBeat(int i10) {
            this.code = i10;
        }

        public int b() {
            return this.code;
        }
    }

    HeartBeat a(String str);
}
