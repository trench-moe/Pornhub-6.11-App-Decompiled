package com.mixpanel.android.util;

/* loaded from: classes.dex */
public interface RemoteService {

    /* loaded from: classes.dex */
    public static class ServiceUnavailableException extends Exception {
        private final int mRetryAfter;

        public ServiceUnavailableException(String str, String str2) {
            super(str);
            int i10;
            try {
                i10 = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                i10 = 0;
            }
            this.mRetryAfter = i10;
        }

        public int a() {
            return this.mRetryAfter;
        }
    }
}
