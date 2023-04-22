package com.app.pornhub.domain.model.common;

import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/app/pornhub/domain/model/common/LikeStatus;", BuildConfig.FLAVOR, "()V", "Dislike", "Like", "None", "Lcom/app/pornhub/domain/model/common/LikeStatus$Like;", "Lcom/app/pornhub/domain/model/common/LikeStatus$Dislike;", "Lcom/app/pornhub/domain/model/common/LikeStatus$None;", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class LikeStatus {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/model/common/LikeStatus$Dislike;", "Lcom/app/pornhub/domain/model/common/LikeStatus;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Dislike extends LikeStatus {
        public static final Dislike INSTANCE = new Dislike();

        private Dislike() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/model/common/LikeStatus$Like;", "Lcom/app/pornhub/domain/model/common/LikeStatus;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Like extends LikeStatus {
        public static final Like INSTANCE = new Like();

        private Like() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/model/common/LikeStatus$None;", "Lcom/app/pornhub/domain/model/common/LikeStatus;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class None extends LikeStatus {
        public static final None INSTANCE = new None();

        private None() {
            super(null);
        }
    }

    private LikeStatus() {
    }

    public /* synthetic */ LikeStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
