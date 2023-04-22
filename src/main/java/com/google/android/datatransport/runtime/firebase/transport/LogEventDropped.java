package com.google.android.datatransport.runtime.firebase.transport;

import jc.b;

/* loaded from: classes.dex */
public final class LogEventDropped {

    /* renamed from: a  reason: collision with root package name */
    public final long f5961a;

    /* renamed from: b  reason: collision with root package name */
    public final Reason f5962b;

    /* loaded from: classes.dex */
    public enum Reason implements b {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        
        private final int number_;

        Reason(int i10) {
            this.number_ = i10;
        }

        @Override // jc.b
        public int getNumber() {
            return this.number_;
        }
    }

    public LogEventDropped(long j10, Reason reason) {
        this.f5961a = j10;
        this.f5962b = reason;
    }
}
