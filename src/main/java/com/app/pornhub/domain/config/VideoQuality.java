package com.app.pornhub.domain.config;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/app/pornhub/domain/config/VideoQuality;", "Ljava/io/Serializable;", "()V", "Q1080p", "Q1440p", "Q2160p", "Q480p", "Q720p", "Lcom/app/pornhub/domain/config/VideoQuality$Q480p;", "Lcom/app/pornhub/domain/config/VideoQuality$Q720p;", "Lcom/app/pornhub/domain/config/VideoQuality$Q1080p;", "Lcom/app/pornhub/domain/config/VideoQuality$Q1440p;", "Lcom/app/pornhub/domain/config/VideoQuality$Q2160p;", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class VideoQuality implements Serializable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/VideoQuality$Q1080p;", "Lcom/app/pornhub/domain/config/VideoQuality;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Q1080p extends VideoQuality {
        public static final Q1080p INSTANCE = new Q1080p();

        private Q1080p() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/VideoQuality$Q1440p;", "Lcom/app/pornhub/domain/config/VideoQuality;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Q1440p extends VideoQuality {
        public static final Q1440p INSTANCE = new Q1440p();

        private Q1440p() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/VideoQuality$Q2160p;", "Lcom/app/pornhub/domain/config/VideoQuality;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Q2160p extends VideoQuality {
        public static final Q2160p INSTANCE = new Q2160p();

        private Q2160p() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/VideoQuality$Q480p;", "Lcom/app/pornhub/domain/config/VideoQuality;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Q480p extends VideoQuality {
        public static final Q480p INSTANCE = new Q480p();

        private Q480p() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/VideoQuality$Q720p;", "Lcom/app/pornhub/domain/config/VideoQuality;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Q720p extends VideoQuality {
        public static final Q720p INSTANCE = new Q720p();

        private Q720p() {
            super(null);
        }
    }

    private VideoQuality() {
    }

    public /* synthetic */ VideoQuality(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
