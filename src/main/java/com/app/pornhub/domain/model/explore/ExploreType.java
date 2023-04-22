package com.app.pornhub.domain.model.explore;

import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/app/pornhub/domain/model/explore/ExploreType;", BuildConfig.FLAVOR, "()V", "Album", "Category", "Channel", "Gif", "Performer", "Video", "Lcom/app/pornhub/domain/model/explore/ExploreType$Video;", "Lcom/app/pornhub/domain/model/explore/ExploreType$Category;", "Lcom/app/pornhub/domain/model/explore/ExploreType$Gif;", "Lcom/app/pornhub/domain/model/explore/ExploreType$Album;", "Lcom/app/pornhub/domain/model/explore/ExploreType$Performer;", "Lcom/app/pornhub/domain/model/explore/ExploreType$Channel;", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ExploreType {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/model/explore/ExploreType$Album;", "Lcom/app/pornhub/domain/model/explore/ExploreType;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Album extends ExploreType {
        public static final Album INSTANCE = new Album();

        private Album() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/model/explore/ExploreType$Category;", "Lcom/app/pornhub/domain/model/explore/ExploreType;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Category extends ExploreType {
        public static final Category INSTANCE = new Category();

        private Category() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/model/explore/ExploreType$Channel;", "Lcom/app/pornhub/domain/model/explore/ExploreType;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Channel extends ExploreType {
        public static final Channel INSTANCE = new Channel();

        private Channel() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/model/explore/ExploreType$Gif;", "Lcom/app/pornhub/domain/model/explore/ExploreType;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Gif extends ExploreType {
        public static final Gif INSTANCE = new Gif();

        private Gif() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/model/explore/ExploreType$Performer;", "Lcom/app/pornhub/domain/model/explore/ExploreType;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Performer extends ExploreType {
        public static final Performer INSTANCE = new Performer();

        private Performer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/model/explore/ExploreType$Video;", "Lcom/app/pornhub/domain/model/explore/ExploreType;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Video extends ExploreType {
        public static final Video INSTANCE = new Video();

        private Video() {
            super(null);
        }
    }

    private ExploreType() {
    }

    public /* synthetic */ ExploreType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
