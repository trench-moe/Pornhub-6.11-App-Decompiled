package com.app.pornhub.domain.config;

import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/app/pornhub/domain/config/FiltersConfig;", BuildConfig.FLAVOR, "()V", "Companion", "Time", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FiltersConfig {
    public static final Companion Companion = new Companion(null);
    private static final String VIDEO_FILTER_ALL_TIME = "a";
    private static final String VIDEO_FILTER_DAILY = "t";
    private static final String VIDEO_FILTER_MONTHLY = "m";
    private static final String VIDEO_FILTER_WEEKLY = "w";
    private static final String VIDEO_FILTER_YEARLY = "y";

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\nJ\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/app/pornhub/domain/config/FiltersConfig$Companion;", BuildConfig.FLAVOR, "()V", "VIDEO_FILTER_ALL_TIME", BuildConfig.FLAVOR, "VIDEO_FILTER_DAILY", "VIDEO_FILTER_MONTHLY", "VIDEO_FILTER_WEEKLY", "VIDEO_FILTER_YEARLY", "getFilter", "Lcom/app/pornhub/domain/config/FiltersConfig$Time;", "abbr", "getFilterAbbr", PerformersConfig.TYPE_FILTER, "getTimeFiltersList", BuildConfig.FLAVOR, "exclude", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Time getFilter(String str) {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 97) {
                    if (hashCode != 109) {
                        if (hashCode != 116) {
                            if (hashCode != 119) {
                                if (hashCode == 121 && str.equals(FiltersConfig.VIDEO_FILTER_YEARLY)) {
                                    return Time.Yearly.INSTANCE;
                                }
                            } else if (str.equals(FiltersConfig.VIDEO_FILTER_WEEKLY)) {
                                return Time.Weekly.INSTANCE;
                            }
                        } else if (str.equals(FiltersConfig.VIDEO_FILTER_DAILY)) {
                            return Time.Daily.INSTANCE;
                        }
                    } else if (str.equals(FiltersConfig.VIDEO_FILTER_MONTHLY)) {
                        return Time.Monthly.INSTANCE;
                    }
                } else if (str.equals(FiltersConfig.VIDEO_FILTER_ALL_TIME)) {
                    return Time.AllTime.INSTANCE;
                }
            }
            return null;
        }

        public final String getFilterAbbr(Time time) {
            if (Intrinsics.areEqual(time, Time.Daily.INSTANCE)) {
                return FiltersConfig.VIDEO_FILTER_DAILY;
            }
            if (Intrinsics.areEqual(time, Time.Weekly.INSTANCE)) {
                return FiltersConfig.VIDEO_FILTER_WEEKLY;
            }
            if (Intrinsics.areEqual(time, Time.Monthly.INSTANCE)) {
                return FiltersConfig.VIDEO_FILTER_MONTHLY;
            }
            if (Intrinsics.areEqual(time, Time.Yearly.INSTANCE)) {
                return FiltersConfig.VIDEO_FILTER_YEARLY;
            }
            if (Intrinsics.areEqual(time, Time.AllTime.INSTANCE)) {
                return FiltersConfig.VIDEO_FILTER_ALL_TIME;
            }
            return null;
        }

        public final List<Time> getTimeFiltersList(List<? extends Time> exclude) {
            Intrinsics.checkNotNullParameter(exclude, "exclude");
            List<KClass> sealedSubclasses = Reflection.getOrCreateKotlinClass(Time.class).getSealedSubclasses();
            ArrayList arrayList = new ArrayList();
            for (KClass kClass : sealedSubclasses) {
                Time time = (Time) kClass.getObjectInstance();
                if (time != null) {
                    arrayList.add(time);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!exclude.contains((Time) obj)) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/app/pornhub/domain/config/FiltersConfig$Time;", BuildConfig.FLAVOR, "()V", "AllTime", "Daily", "Monthly", "Weekly", "Yearly", "Lcom/app/pornhub/domain/config/FiltersConfig$Time$Daily;", "Lcom/app/pornhub/domain/config/FiltersConfig$Time$Weekly;", "Lcom/app/pornhub/domain/config/FiltersConfig$Time$Monthly;", "Lcom/app/pornhub/domain/config/FiltersConfig$Time$Yearly;", "Lcom/app/pornhub/domain/config/FiltersConfig$Time$AllTime;", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static abstract class Time {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/FiltersConfig$Time$AllTime;", "Lcom/app/pornhub/domain/config/FiltersConfig$Time;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class AllTime extends Time {
            public static final AllTime INSTANCE = new AllTime();

            private AllTime() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/FiltersConfig$Time$Daily;", "Lcom/app/pornhub/domain/config/FiltersConfig$Time;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Daily extends Time {
            public static final Daily INSTANCE = new Daily();

            private Daily() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/FiltersConfig$Time$Monthly;", "Lcom/app/pornhub/domain/config/FiltersConfig$Time;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Monthly extends Time {
            public static final Monthly INSTANCE = new Monthly();

            private Monthly() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/FiltersConfig$Time$Weekly;", "Lcom/app/pornhub/domain/config/FiltersConfig$Time;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Weekly extends Time {
            public static final Weekly INSTANCE = new Weekly();

            private Weekly() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/app/pornhub/domain/config/FiltersConfig$Time$Yearly;", "Lcom/app/pornhub/domain/config/FiltersConfig$Time;", "()V", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Yearly extends Time {
            public static final Yearly INSTANCE = new Yearly();

            private Yearly() {
                super(null);
            }
        }

        private Time() {
        }

        public /* synthetic */ Time(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
