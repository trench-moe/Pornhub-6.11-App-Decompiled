package com.app.pornhub.domain.model.comment;

import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/app/pornhub/domain/model/comment/CommentsSource;", BuildConfig.FLAVOR, "()V", "Gif", "Video", "Lcom/app/pornhub/domain/model/comment/CommentsSource$Video;", "Lcom/app/pornhub/domain/model/comment/CommentsSource$Gif;", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CommentsSource {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/model/comment/CommentsSource$Gif;", "Lcom/app/pornhub/domain/model/comment/CommentsSource;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Gif extends CommentsSource {
        public static final Gif INSTANCE = new Gif();

        private Gif() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/model/comment/CommentsSource$Video;", "Lcom/app/pornhub/domain/model/comment/CommentsSource;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Video extends CommentsSource {
        public static final Video INSTANCE = new Video();

        private Video() {
            super(null);
        }
    }

    private CommentsSource() {
    }

    public /* synthetic */ CommentsSource(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
