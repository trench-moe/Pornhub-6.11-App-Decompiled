package com.app.pornhub.domain.config;

import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/app/pornhub/domain/config/PlaylistsType;", BuildConfig.FLAVOR, "()V", "Favorite", "Overview", "Private", "Public", "Lcom/app/pornhub/domain/config/PlaylistsType$Overview;", "Lcom/app/pornhub/domain/config/PlaylistsType$Public;", "Lcom/app/pornhub/domain/config/PlaylistsType$Private;", "Lcom/app/pornhub/domain/config/PlaylistsType$Favorite;", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class PlaylistsType {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/PlaylistsType$Favorite;", "Lcom/app/pornhub/domain/config/PlaylistsType;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Favorite extends PlaylistsType {
        public static final Favorite INSTANCE = new Favorite();

        private Favorite() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/PlaylistsType$Overview;", "Lcom/app/pornhub/domain/config/PlaylistsType;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Overview extends PlaylistsType {
        public static final Overview INSTANCE = new Overview();

        private Overview() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/PlaylistsType$Private;", "Lcom/app/pornhub/domain/config/PlaylistsType;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Private extends PlaylistsType {
        public static final Private INSTANCE = new Private();

        private Private() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/PlaylistsType$Public;", "Lcom/app/pornhub/domain/config/PlaylistsType;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Public extends PlaylistsType {
        public static final Public INSTANCE = new Public();

        private Public() {
            super(null);
        }
    }

    private PlaylistsType() {
    }

    public /* synthetic */ PlaylistsType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
