package com.app.pornhub.domain.config;

import com.app.pornhub.data.model.explore.ExploreModel;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/app/pornhub/domain/config/PerformersConfig;", BuildConfig.FLAVOR, "()V", "Companion", "PerformerType", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PerformersConfig {
    public static final Companion Companion = new Companion(null);
    public static final String DEFAULT_LISTINGS_ORDER = "mp";
    public static final String DEFAULT_VIDEOS_ORDER = "mr";
    public static final int LISTINGS_SPAN_COUNT = 2;
    public static final int PAGINATION = 16;
    public static final String RATING_DOWN = "down";
    public static final String RATING_UP = "up";
    public static final String TYPE_FILTER = "filter";
    public static final String TYPE_LETTER = "letter";
    public static final int VIDEOS_PAGINATION = 8;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0007J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007J\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/app/pornhub/domain/config/PerformersConfig$Companion;", BuildConfig.FLAVOR, "()V", "DEFAULT_LISTINGS_ORDER", BuildConfig.FLAVOR, "DEFAULT_VIDEOS_ORDER", "LISTINGS_SPAN_COUNT", BuildConfig.FLAVOR, "PAGINATION", "RATING_DOWN", "RATING_UP", "TYPE_FILTER", "TYPE_LETTER", "VIDEOS_PAGINATION", "deserializePerformerType", "Lcom/app/pornhub/domain/config/PerformersConfig$PerformerType;", "type", "getPerformerTypeList", BuildConfig.FLAVOR, "hasMorePerformerVideos", BuildConfig.FLAVOR, "size", "hasMorePerformers", "serializePerformerType", "performerType", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final PerformerType deserializePerformerType(String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            int hashCode = type.hashCode();
            if (hashCode != -892740605) {
                if (hashCode != 96673) {
                    if (hashCode == 723773773 && type.equals(ExploreModel.PORNSTAR)) {
                        return PerformerType.Pornstar.INSTANCE;
                    }
                } else if (type.equals("all")) {
                    return PerformerType.All.INSTANCE;
                }
            } else if (type.equals("amateur")) {
                return PerformerType.Model.INSTANCE;
            }
            throw new IllegalStateException("Unknown performer type");
        }

        public final List<PerformerType> getPerformerTypeList() {
            List<KClass> sealedSubclasses = Reflection.getOrCreateKotlinClass(PerformerType.class).getSealedSubclasses();
            ArrayList arrayList = new ArrayList();
            for (KClass kClass : sealedSubclasses) {
                PerformerType performerType = (PerformerType) kClass.getObjectInstance();
                if (performerType != null) {
                    arrayList.add(performerType);
                }
            }
            return arrayList;
        }

        public final boolean hasMorePerformerVideos(int i10) {
            return i10 % 8 == 0;
        }

        public final boolean hasMorePerformers(int i10) {
            return i10 % 16 == 0;
        }

        @JvmStatic
        public final String serializePerformerType(PerformerType performerType) {
            Intrinsics.checkNotNullParameter(performerType, "performerType");
            if (performerType instanceof PerformerType.All) {
                return "all";
            }
            if (performerType instanceof PerformerType.Pornstar) {
                return ExploreModel.PORNSTAR;
            }
            if (performerType instanceof PerformerType.Model) {
                return "amateur";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/app/pornhub/domain/config/PerformersConfig$PerformerType;", BuildConfig.FLAVOR, "()V", "All", "Model", "Pornstar", "Lcom/app/pornhub/domain/config/PerformersConfig$PerformerType$All;", "Lcom/app/pornhub/domain/config/PerformersConfig$PerformerType$Pornstar;", "Lcom/app/pornhub/domain/config/PerformersConfig$PerformerType$Model;", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static abstract class PerformerType {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/PerformersConfig$PerformerType$All;", "Lcom/app/pornhub/domain/config/PerformersConfig$PerformerType;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class All extends PerformerType {
            public static final All INSTANCE = new All();

            private All() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/PerformersConfig$PerformerType$Model;", "Lcom/app/pornhub/domain/config/PerformersConfig$PerformerType;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Model extends PerformerType {
            public static final Model INSTANCE = new Model();

            private Model() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/PerformersConfig$PerformerType$Pornstar;", "Lcom/app/pornhub/domain/config/PerformersConfig$PerformerType;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Pornstar extends PerformerType {
            public static final Pornstar INSTANCE = new Pornstar();

            private Pornstar() {
                super(null);
            }
        }

        private PerformerType() {
        }

        public /* synthetic */ PerformerType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmStatic
    public static final PerformerType deserializePerformerType(String str) {
        return Companion.deserializePerformerType(str);
    }

    @JvmStatic
    public static final String serializePerformerType(PerformerType performerType) {
        return Companion.serializePerformerType(performerType);
    }
}
