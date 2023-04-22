package com.app.pornhub.domain.model.user;

import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/app/pornhub/domain/model/user/UserOrientation;", BuildConfig.FLAVOR, "()V", "Gay", "Straight", "Lcom/app/pornhub/domain/model/user/UserOrientation$Straight;", "Lcom/app/pornhub/domain/model/user/UserOrientation$Gay;", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class UserOrientation {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/model/user/UserOrientation$Gay;", "Lcom/app/pornhub/domain/model/user/UserOrientation;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Gay extends UserOrientation {
        public static final Gay INSTANCE = new Gay();

        private Gay() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/model/user/UserOrientation$Straight;", "Lcom/app/pornhub/domain/model/user/UserOrientation;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Straight extends UserOrientation {
        public static final Straight INSTANCE = new Straight();

        private Straight() {
            super(null);
        }
    }

    private UserOrientation() {
    }

    public /* synthetic */ UserOrientation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
