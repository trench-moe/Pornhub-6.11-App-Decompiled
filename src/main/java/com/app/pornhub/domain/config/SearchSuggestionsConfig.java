package com.app.pornhub.domain.config;

import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/app/pornhub/domain/config/SearchSuggestionsConfig;", BuildConfig.FLAVOR, "()V", "Companion", "SearchSource", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SearchSuggestionsConfig {
    public static final Companion Companion = new Companion(null);
    public static final String sourceGifs = "gifs";
    public static final String sourceMembers = "members";
    public static final String sourcePhotos = "photos";
    public static final String sourcePornstars = "pornstars";
    public static final String sourceVideos = "videos";

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/app/pornhub/domain/config/SearchSuggestionsConfig$Companion;", BuildConfig.FLAVOR, "()V", "sourceGifs", BuildConfig.FLAVOR, "sourceMembers", "sourcePhotos", "sourcePornstars", "sourceVideos", "getSearchSourceName", "searchSource", "Lcom/app/pornhub/domain/config/SearchSuggestionsConfig$SearchSource;", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getSearchSourceName(SearchSource searchSource) {
            Intrinsics.checkNotNullParameter(searchSource, "searchSource");
            if (Intrinsics.areEqual(searchSource, SearchSource.Videos.INSTANCE)) {
                return SearchSuggestionsConfig.sourceVideos;
            }
            if (Intrinsics.areEqual(searchSource, SearchSource.Photos.INSTANCE)) {
                return SearchSuggestionsConfig.sourcePhotos;
            }
            if (Intrinsics.areEqual(searchSource, SearchSource.Gifs.INSTANCE)) {
                return SearchSuggestionsConfig.sourceGifs;
            }
            if (Intrinsics.areEqual(searchSource, SearchSource.Pornstars.INSTANCE)) {
                return SearchSuggestionsConfig.sourcePornstars;
            }
            if (Intrinsics.areEqual(searchSource, SearchSource.Members.INSTANCE)) {
                return SearchSuggestionsConfig.sourceMembers;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/app/pornhub/domain/config/SearchSuggestionsConfig$SearchSource;", BuildConfig.FLAVOR, "()V", "Gifs", "Members", "Photos", "Pornstars", "Videos", "Lcom/app/pornhub/domain/config/SearchSuggestionsConfig$SearchSource$Videos;", "Lcom/app/pornhub/domain/config/SearchSuggestionsConfig$SearchSource$Photos;", "Lcom/app/pornhub/domain/config/SearchSuggestionsConfig$SearchSource$Gifs;", "Lcom/app/pornhub/domain/config/SearchSuggestionsConfig$SearchSource$Pornstars;", "Lcom/app/pornhub/domain/config/SearchSuggestionsConfig$SearchSource$Members;", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static abstract class SearchSource {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/SearchSuggestionsConfig$SearchSource$Gifs;", "Lcom/app/pornhub/domain/config/SearchSuggestionsConfig$SearchSource;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Gifs extends SearchSource {
            public static final Gifs INSTANCE = new Gifs();

            private Gifs() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/SearchSuggestionsConfig$SearchSource$Members;", "Lcom/app/pornhub/domain/config/SearchSuggestionsConfig$SearchSource;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Members extends SearchSource {
            public static final Members INSTANCE = new Members();

            private Members() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/SearchSuggestionsConfig$SearchSource$Photos;", "Lcom/app/pornhub/domain/config/SearchSuggestionsConfig$SearchSource;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Photos extends SearchSource {
            public static final Photos INSTANCE = new Photos();

            private Photos() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/SearchSuggestionsConfig$SearchSource$Pornstars;", "Lcom/app/pornhub/domain/config/SearchSuggestionsConfig$SearchSource;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Pornstars extends SearchSource {
            public static final Pornstars INSTANCE = new Pornstars();

            private Pornstars() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/SearchSuggestionsConfig$SearchSource$Videos;", "Lcom/app/pornhub/domain/config/SearchSuggestionsConfig$SearchSource;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Videos extends SearchSource {
            public static final Videos INSTANCE = new Videos();

            private Videos() {
                super(null);
            }
        }

        private SearchSource() {
        }

        public /* synthetic */ SearchSource(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
