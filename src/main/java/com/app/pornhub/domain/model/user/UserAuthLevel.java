package com.app.pornhub.domain.model.user;

import com.app.pornhub.domain.config.UsersConfig;
import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/app/pornhub/domain/model/user/UserAuthLevel;", BuildConfig.FLAVOR, "()V", UsersConfig.USER_TYPE_EXPIRED, UsersConfig.USER_TYPE_FREE, "None", UsersConfig.USER_TYPE_PREMIUM, UsersConfig.USER_TYPE_TRIAL, "Lcom/app/pornhub/domain/model/user/UserAuthLevel$None;", "Lcom/app/pornhub/domain/model/user/UserAuthLevel$Free;", "Lcom/app/pornhub/domain/model/user/UserAuthLevel$Trial;", "Lcom/app/pornhub/domain/model/user/UserAuthLevel$Expired;", "Lcom/app/pornhub/domain/model/user/UserAuthLevel$Premium;", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class UserAuthLevel {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/model/user/UserAuthLevel$Expired;", "Lcom/app/pornhub/domain/model/user/UserAuthLevel;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Expired extends UserAuthLevel {
        public static final Expired INSTANCE = new Expired();

        private Expired() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/model/user/UserAuthLevel$Free;", "Lcom/app/pornhub/domain/model/user/UserAuthLevel;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Free extends UserAuthLevel {
        public static final Free INSTANCE = new Free();

        private Free() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/model/user/UserAuthLevel$None;", "Lcom/app/pornhub/domain/model/user/UserAuthLevel;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class None extends UserAuthLevel {
        public static final None INSTANCE = new None();

        private None() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/model/user/UserAuthLevel$Premium;", "Lcom/app/pornhub/domain/model/user/UserAuthLevel;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Premium extends UserAuthLevel {
        public static final Premium INSTANCE = new Premium();

        private Premium() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/model/user/UserAuthLevel$Trial;", "Lcom/app/pornhub/domain/model/user/UserAuthLevel;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Trial extends UserAuthLevel {
        public static final Trial INSTANCE = new Trial();

        private Trial() {
            super(null);
        }
    }

    private UserAuthLevel() {
    }

    public /* synthetic */ UserAuthLevel(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
