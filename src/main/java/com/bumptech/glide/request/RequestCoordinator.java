package com.bumptech.glide.request;

import z5.c;

/* loaded from: classes.dex */
public interface RequestCoordinator {

    /* loaded from: classes.dex */
    public enum RequestState {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        
        private final boolean isComplete;

        RequestState(boolean z10) {
            this.isComplete = z10;
        }

        public boolean b() {
            return this.isComplete;
        }
    }

    boolean a();

    RequestCoordinator b();

    boolean c(c cVar);

    void d(c cVar);

    boolean e(c cVar);

    boolean g(c cVar);

    void j(c cVar);
}
