package io.reactivex.rxkotlin;

import com.appsflyer.oaid.BuildConfig;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function3;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jh\u0010\u0003\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u00050\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\b*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\nH\u0007J\u0083\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\b*\u00020\u0001\"\b\b\u0003\u0010\r*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\n2 \b\u0004\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\r0\u000fH\u0087\bJ¡\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\b*\u00020\u0001\"\b\b\u0003\u0010\u0010*\u00020\u0001\"\b\b\u0004\u0010\r*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\n2&\b\u0004\u0010\u000e\u001a \u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\r0\u0012H\u0087\bJ¿\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\b*\u00020\u0001\"\b\b\u0003\u0010\u0010*\u00020\u0001\"\b\b\u0004\u0010\u0013*\u00020\u0001\"\b\b\u0005\u0010\r*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\n2,\b\u0004\u0010\u000e\u001a&\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\r0\u0015H\u0087\bJÝ\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\b*\u00020\u0001\"\b\b\u0003\u0010\u0010*\u00020\u0001\"\b\b\u0004\u0010\u0013*\u00020\u0001\"\b\b\u0005\u0010\u0016*\u00020\u0001\"\b\b\u0006\u0010\r*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\n22\b\u0004\u0010\u000e\u001a,\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\r0\u0018H\u0087\bJû\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\b*\u00020\u0001\"\b\b\u0003\u0010\u0010*\u00020\u0001\"\b\b\u0004\u0010\u0013*\u00020\u0001\"\b\b\u0005\u0010\u0016*\u00020\u0001\"\b\b\u0006\u0010\u0019*\u00020\u0001\"\b\b\u0007\u0010\r*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\n28\b\u0004\u0010\u000e\u001a2\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\r0\u001bH\u0087\bJ\u0099\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\b*\u00020\u0001\"\b\b\u0003\u0010\u0010*\u00020\u0001\"\b\b\u0004\u0010\u0013*\u00020\u0001\"\b\b\u0005\u0010\u0016*\u00020\u0001\"\b\b\u0006\u0010\u0019*\u00020\u0001\"\b\b\u0007\u0010\u001c*\u00020\u0001\"\b\b\b\u0010\r*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\n2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001c0\n2>\b\u0004\u0010\u000e\u001a8\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\r0\u001eH\u0087\bJ·\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\b*\u00020\u0001\"\b\b\u0003\u0010\u0010*\u00020\u0001\"\b\b\u0004\u0010\u0013*\u00020\u0001\"\b\b\u0005\u0010\u0016*\u00020\u0001\"\b\b\u0006\u0010\u0019*\u00020\u0001\"\b\b\u0007\u0010\u001c*\u00020\u0001\"\b\b\b\u0010\u001f*\u00020\u0001\"\b\b\t\u0010\r*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\n2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001c0\n2\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u001f0\n2D\b\u0004\u0010\u000e\u001a>\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001c\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H\r0!H\u0087\bJJ\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H$0\"0\u0004\"\b\b\u0000\u0010#*\u00020\u0001\"\b\b\u0001\u0010$*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H#0\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H$0\nH\u0007Je\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u0004\"\b\b\u0000\u0010#*\u00020\u0001\"\b\b\u0001\u0010$*\u00020\u0001\"\b\b\u0002\u0010\r*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H#0\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H$0\n2\u001a\b\u0004\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H$\u0012\u0004\u0012\u0002H\r0%H\u0087\b¨\u0006&"}, d2 = {"Lio/reactivex/rxkotlin/Singles;", BuildConfig.FLAVOR, "()V", "zip", "Lio/reactivex/Single;", "Lkotlin/Triple;", "T1", "T2", "T3", "s1", "Lio/reactivex/SingleSource;", "s2", "s3", "R", "zipper", "Lkotlin/Function3;", "T4", "s4", "Lkotlin/Function4;", "T5", "s5", "Lkotlin/Function5;", "T6", "s6", "Lkotlin/Function6;", "T7", "s7", "Lkotlin/Function7;", "T8", "s8", "Lkotlin/Function8;", "T9", "s9", "Lkotlin/Function9;", "Lkotlin/Pair;", "T", "U", "Lkotlin/Function2;", "rxkotlin"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes2.dex */
public final class Singles {
    public static final Singles INSTANCE = new Singles();

    private Singles() {
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public final <T, U> Single<Pair<T, U>> zip(SingleSource<T> singleSource, SingleSource<U> singleSource2) {
        Single<Pair<T, U>> zip = Single.zip(singleSource, singleSource2, new BiFunction<T, U, Pair<? extends T, ? extends U>>() { // from class: io.reactivex.rxkotlin.Singles$zip$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
                return apply((Singles$zip$2<T1, T2, R, T, U>) obj, obj2);
            }

            @Override // io.reactivex.functions.BiFunction
            public final Pair<T, U> apply(T t2, U u2) {
                return new Pair<>(t2, u2);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(zip, "Single.zip(s1, s2, BiFun…n { t, u -> Pair(t, u) })");
        return zip;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public final <T1, T2, T3> Single<Triple<T1, T2, T3>> zip(SingleSource<T1> singleSource, SingleSource<T2> singleSource2, SingleSource<T3> singleSource3) {
        Single<Triple<T1, T2, T3>> zip = Single.zip(singleSource, singleSource2, singleSource3, new Function3<T1, T2, T3, Triple<? extends T1, ? extends T2, ? extends T3>>() { // from class: io.reactivex.rxkotlin.Singles$zip$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function3
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2, Object obj3) {
                return apply((Singles$zip$4<T1, T2, T3, R>) obj, obj2, obj3);
            }

            @Override // io.reactivex.functions.Function3
            public final Triple<T1, T2, T3> apply(T1 t12, T2 t2, T3 t32) {
                return new Triple<>(t12, t2, t32);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(zip, "Single.zip(s1, s2, s3, F… -> Triple(t1, t2, t3) })");
        return zip;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Single<R> zip(SingleSource<T1> singleSource, SingleSource<T2> singleSource2, SingleSource<T3> singleSource3, SingleSource<T4> singleSource4, SingleSource<T5> singleSource5, SingleSource<T6> singleSource6, SingleSource<T7> singleSource7, SingleSource<T8> singleSource8, SingleSource<T9> singleSource9, final Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> function9) {
        Single<R> zip = Single.zip(singleSource, singleSource2, singleSource3, singleSource4, singleSource5, singleSource6, singleSource7, singleSource8, singleSource9, new io.reactivex.functions.Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R>() { // from class: io.reactivex.rxkotlin.Singles$zip$10
            @Override // io.reactivex.functions.Function9
            public final R apply(T1 t12, T2 t2, T3 t32, T4 t42, T5 t52, T6 t62, T7 t72, T8 t8, T9 t92) {
                return (R) Function9.this.invoke(t12, t2, t32, t42, t52, t62, t72, t8, t92);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(zip, "Single.zip(s1, s2, s3, s…4, t5, t6, t7, t8, t9) })");
        return zip;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, T7, T8, R> Single<R> zip(SingleSource<T1> singleSource, SingleSource<T2> singleSource2, SingleSource<T3> singleSource3, SingleSource<T4> singleSource4, SingleSource<T5> singleSource5, SingleSource<T6> singleSource6, SingleSource<T7> singleSource7, SingleSource<T8> singleSource8, final Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> function8) {
        Single<R> zip = Single.zip(singleSource, singleSource2, singleSource3, singleSource4, singleSource5, singleSource6, singleSource7, singleSource8, new io.reactivex.functions.Function8<T1, T2, T3, T4, T5, T6, T7, T8, R>() { // from class: io.reactivex.rxkotlin.Singles$zip$9
            @Override // io.reactivex.functions.Function8
            public final R apply(T1 t12, T2 t2, T3 t32, T4 t42, T5 t52, T6 t62, T7 t72, T8 t8) {
                return (R) Function8.this.invoke(t12, t2, t32, t42, t52, t62, t72, t8);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(zip, "Single.zip(s1, s2, s3, s…3, t4, t5, t6, t7, t8) })");
        return zip;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, T7, R> Single<R> zip(SingleSource<T1> singleSource, SingleSource<T2> singleSource2, SingleSource<T3> singleSource3, SingleSource<T4> singleSource4, SingleSource<T5> singleSource5, SingleSource<T6> singleSource6, SingleSource<T7> singleSource7, final Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> function7) {
        Single<R> zip = Single.zip(singleSource, singleSource2, singleSource3, singleSource4, singleSource5, singleSource6, singleSource7, new io.reactivex.functions.Function7<T1, T2, T3, T4, T5, T6, T7, R>() { // from class: io.reactivex.rxkotlin.Singles$zip$8
            @Override // io.reactivex.functions.Function7
            public final R apply(T1 t12, T2 t2, T3 t32, T4 t42, T5 t52, T6 t62, T7 t72) {
                return (R) Function7.this.invoke(t12, t2, t32, t42, t52, t62, t72);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(zip, "Single.zip(s1, s2, s3, s…2, t3, t4, t5, t6, t7) })");
        return zip;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, R> Single<R> zip(SingleSource<T1> singleSource, SingleSource<T2> singleSource2, SingleSource<T3> singleSource3, SingleSource<T4> singleSource4, SingleSource<T5> singleSource5, SingleSource<T6> singleSource6, final Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> function6) {
        Single<R> zip = Single.zip(singleSource, singleSource2, singleSource3, singleSource4, singleSource5, singleSource6, new io.reactivex.functions.Function6<T1, T2, T3, T4, T5, T6, R>() { // from class: io.reactivex.rxkotlin.Singles$zip$7
            @Override // io.reactivex.functions.Function6
            public final R apply(T1 t12, T2 t2, T3 t32, T4 t42, T5 t52, T6 t62) {
                return (R) Function6.this.invoke(t12, t2, t32, t42, t52, t62);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(zip, "Single.zip(s1, s2, s3, s…1, t2, t3, t4, t5, t6) })");
        return zip;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, R> Single<R> zip(SingleSource<T1> singleSource, SingleSource<T2> singleSource2, SingleSource<T3> singleSource3, SingleSource<T4> singleSource4, SingleSource<T5> singleSource5, final Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> function5) {
        Single<R> zip = Single.zip(singleSource, singleSource2, singleSource3, singleSource4, singleSource5, new io.reactivex.functions.Function5<T1, T2, T3, T4, T5, R>() { // from class: io.reactivex.rxkotlin.Singles$zip$6
            @Override // io.reactivex.functions.Function5
            public final R apply(T1 t12, T2 t2, T3 t32, T4 t42, T5 t52) {
                return (R) Function5.this.invoke(t12, t2, t32, t42, t52);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(zip, "Single.zip(s1, s2, s3, s…ke(t1, t2, t3, t4, t5) })");
        return zip;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public final <T1, T2, T3, T4, R> Single<R> zip(SingleSource<T1> singleSource, SingleSource<T2> singleSource2, SingleSource<T3> singleSource3, SingleSource<T4> singleSource4, final Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> function4) {
        Single<R> zip = Single.zip(singleSource, singleSource2, singleSource3, singleSource4, new io.reactivex.functions.Function4<T1, T2, T3, T4, R>() { // from class: io.reactivex.rxkotlin.Singles$zip$5
            @Override // io.reactivex.functions.Function4
            public final R apply(T1 t12, T2 t2, T3 t32, T4 t42) {
                return (R) Function4.this.invoke(t12, t2, t32, t42);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(zip, "Single.zip(s1, s2, s3, s…invoke(t1, t2, t3, t4) })");
        return zip;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public final <T1, T2, T3, R> Single<R> zip(SingleSource<T1> singleSource, SingleSource<T2> singleSource2, SingleSource<T3> singleSource3, final kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super T3, ? extends R> function3) {
        Single<R> zip = Single.zip(singleSource, singleSource2, singleSource3, new Function3<T1, T2, T3, R>() { // from class: io.reactivex.rxkotlin.Singles$zip$3
            @Override // io.reactivex.functions.Function3
            public final R apply(T1 t12, T2 t2, T3 t32) {
                return (R) kotlin.jvm.functions.Function3.this.invoke(t12, t2, t32);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(zip, "Single.zip(s1, s2, s3, F…per.invoke(t1, t2, t3) })");
        return zip;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public final <T, U, R> Single<R> zip(SingleSource<T> singleSource, SingleSource<U> singleSource2, final Function2<? super T, ? super U, ? extends R> function2) {
        Single<R> zip = Single.zip(singleSource, singleSource2, new BiFunction<T, U, R>() { // from class: io.reactivex.rxkotlin.Singles$zip$1
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T t2, U u2) {
                return (R) Function2.this.invoke(t2, u2);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(zip, "Single.zip(s1, s2, BiFun…-> zipper.invoke(t, u) })");
        return zip;
    }
}
