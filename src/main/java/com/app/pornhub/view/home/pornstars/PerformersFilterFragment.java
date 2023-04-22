package com.app.pornhub.view.home.pornstars;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.a0;
import androidx.lifecycle.z;
import androidx.navigation.i;
import b4.b;
import cb.e;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ActivityHomeBinding;
import com.app.pornhub.databinding.FragmentPerformersFiltersBinding;
import com.app.pornhub.databinding.ItemPornstarsAdditionalFiltersRadioSectionBinding;
import com.app.pornhub.databinding.ItemPornstarsAdditionalFiltersSliderSectionBinding;
import com.app.pornhub.domain.model.performer.PerformerAdditionalFilter;
import com.app.pornhub.domain.model.performer.PerformerIncompatibleFilterChoice;
import com.app.pornhub.view.common.FragmentViewBindingDelegate;
import com.app.pornhub.view.home.HomeActivity;
import com.app.pornhub.view.home.pornstars.PerformersFilterFragment;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.material.slider.RangeSlider;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import m9.a;
import s4.d;
import v3.c;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/app/pornhub/view/home/pornstars/PerformersFilterFragment;", "Lv3/c;", "<init>", "()V", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class PerformersFilterFragment extends c {

    /* renamed from: u0  reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f5275u0 = {Reflection.property1(new PropertyReference1Impl(PerformersFilterFragment.class, "binding", "getBinding()Lcom/app/pornhub/databinding/FragmentPerformersFiltersBinding;", 0))};

    /* renamed from: p0  reason: collision with root package name */
    public Map<Integer, View> f5276p0;

    /* renamed from: q0  reason: collision with root package name */
    public final FragmentViewBindingDelegate f5277q0;

    /* renamed from: r0  reason: collision with root package name */
    public final Lazy f5278r0;

    /* renamed from: s0  reason: collision with root package name */
    public List<PerformerAdditionalFilter> f5279s0;

    /* renamed from: t0  reason: collision with root package name */
    public final Map<String, String> f5280t0;

    public PerformersFilterFragment() {
        super(R.layout.fragment_performers_filters);
        this.f5276p0 = new LinkedHashMap();
        this.f5277q0 = a.F(this, PerformersFilterFragment$binding$2.f5281c, null, 2);
        final Function0<z.b> function0 = new Function0<z.b>() { // from class: com.app.pornhub.view.home.pornstars.PerformersFilterFragment$viewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public z.b invoke() {
                return PerformersFilterFragment.this.L0();
            }
        };
        final Lazy lazy = LazyKt.lazy(new Function0<i>() { // from class: com.app.pornhub.view.home.pornstars.PerformersFilterFragment$special$$inlined$navGraphViewModels$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public i invoke() {
                return t3.a.i(Fragment.this).d(r2);
            }
        });
        this.f5278r0 = e.w(this, Reflection.getOrCreateKotlinClass(PerformersViewModel.class), new Function0<a0>(null) { // from class: com.app.pornhub.view.home.pornstars.PerformersFilterFragment$special$$inlined$navGraphViewModels$2
            public final /* synthetic */ KProperty $backStackEntry$metadata = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public a0 invoke() {
                i backStackEntry = (i) Lazy.this.getValue();
                Intrinsics.checkExpressionValueIsNotNull(backStackEntry, "backStackEntry");
                a0 j10 = backStackEntry.j();
                Intrinsics.checkExpressionValueIsNotNull(j10, "backStackEntry.viewModelStore");
                return j10;
            }
        }, new Function0<z.b>(lazy, null) { // from class: com.app.pornhub.view.home.pornstars.PerformersFilterFragment$special$$inlined$navGraphViewModels$3
            public final /* synthetic */ Lazy $backStackEntry;
            public final /* synthetic */ KProperty $backStackEntry$metadata = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public z.b invoke() {
                z.b bVar;
                Function0 function02 = Function0.this;
                if (function02 == null || (bVar = (z.b) function02.invoke()) == null) {
                    i backStackEntry = (i) this.$backStackEntry.getValue();
                    Intrinsics.checkExpressionValueIsNotNull(backStackEntry, "backStackEntry");
                    z.b a10 = backStackEntry.a();
                    Intrinsics.checkExpressionValueIsNotNull(a10, "backStackEntry.defaultViewModelProviderFactory");
                    return a10;
                }
                return bVar;
            }
        });
        this.f5280t0 = new LinkedHashMap();
    }

    @Override // v3.c
    public void K0() {
        this.f5276p0.clear();
    }

    public final FragmentPerformersFiltersBinding M0() {
        return (FragmentPerformersFiltersBinding) this.f5277q0.getValue(this, f5275u0[0]);
    }

    public final PerformersViewModel N0() {
        return (PerformersViewModel) this.f5278r0.getValue();
    }

    @Override // v3.c, androidx.fragment.app.Fragment
    public void Y() {
        super.Y();
        this.f5276p0.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void k0(View view, Bundle bundle) {
        List listOf;
        Intrinsics.checkNotNullParameter(view, "view");
        M0().d.setOnClickListener(new u3.c(this, 8));
        M0().f4636c.setOnClickListener(new u3.a(this, 11));
        M0().f4635b.setOnClickListener(new b(this, 6));
        this.f5279s0 = N0().f5299g.f11778a.a();
        if (this.f5280t0.isEmpty()) {
            this.f5280t0.putAll(N0().e());
        }
        Bitmap bitmap = N0().f5306o;
        if (bitmap != null) {
            final ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setInterpolator(new DecelerateInterpolator());
            valueAnimator.setDuration(400L);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: g4.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (r3) {
                        case 0:
                            HomeActivity this$0 = (HomeActivity) this;
                            ValueAnimator this_apply = valueAnimator;
                            int i10 = HomeActivity.f4998a0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                            ActivityHomeBinding activityHomeBinding = this$0.K;
                            if (activityHomeBinding == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                activityHomeBinding = null;
                            }
                            FrameLayout frameLayout = activityHomeBinding.f4396i;
                            Object animatedValue = this_apply.getAnimatedValue();
                            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                            frameLayout.setAlpha(((Float) animatedValue).floatValue());
                            return;
                        default:
                            PerformersFilterFragment this$02 = (PerformersFilterFragment) this;
                            ValueAnimator this_apply2 = valueAnimator;
                            KProperty<Object>[] kPropertyArr = PerformersFilterFragment.f5275u0;
                            Intrinsics.checkNotNullParameter(this$02, "this$0");
                            Intrinsics.checkNotNullParameter(this_apply2, "$this_apply");
                            ImageView imageView = this$02.M0().f4638f;
                            Object animatedValue2 = this_apply2.getAnimatedValue();
                            Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                            imageView.setAlpha(((Float) animatedValue2).floatValue());
                            return;
                    }
                }
            });
            valueAnimator.addListener(new d(this, bitmap));
            valueAnimator.start();
        }
        List<PerformerAdditionalFilter> list = this.f5279s0;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filters");
            list = null;
        }
        for (final PerformerAdditionalFilter performerAdditionalFilter : list) {
            int i10 = 0;
            if (Intrinsics.areEqual(performerAdditionalFilter.getValue(), "age")) {
                ItemPornstarsAdditionalFiltersSliderSectionBinding bind = ItemPornstarsAdditionalFiltersSliderSectionBinding.bind(x().inflate(R.layout.item_pornstars_additional_filters_slider_section, (ViewGroup) M0().f4637e, false));
                Intrinsics.checkNotNullExpressionValue(bind, "inflate(\n            lay…          false\n        )");
                bind.f4784b.setText(performerAdditionalFilter.getTitle());
                if (this.f5280t0.containsKey(performerAdditionalFilter.getValue())) {
                    String str = this.f5280t0.get(performerAdditionalFilter.getValue());
                    Intrinsics.checkNotNull(str);
                    List split$default = StringsKt.split$default((CharSequence) str, new String[]{"-"}, false, 0, 6, (Object) null);
                    listOf = CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(performerAdditionalFilter.getOptions().indexOf(split$default.get(0))), Float.valueOf(performerAdditionalFilter.getOptions().indexOf(split$default.get(1)))});
                } else {
                    listOf = CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(0.0f), Float.valueOf(CollectionsKt.getLastIndex(performerAdditionalFilter.getOptions()))});
                }
                RangeSlider rangeSlider = bind.f4785c;
                rangeSlider.setValueFrom(0.0f);
                rangeSlider.setValueTo(CollectionsKt.getLastIndex(performerAdditionalFilter.getOptions()));
                rangeSlider.setValues(listOf);
                rangeSlider.setStepSize(1.0f);
                rangeSlider.setMinSeparationValue(1.0f);
                rangeSlider.y(new com.google.android.material.slider.a() { // from class: s4.c
                    @Override // com.google.android.material.slider.a
                    public final void a(Object obj, float f10, boolean z10) {
                        PerformersFilterFragment this$0 = PerformersFilterFragment.this;
                        PerformerAdditionalFilter filter = performerAdditionalFilter;
                        RangeSlider slider = (RangeSlider) obj;
                        KProperty<Object>[] kPropertyArr = PerformersFilterFragment.f5275u0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(filter, "$filter");
                        Intrinsics.checkNotNullParameter(slider, "slider");
                        if (Intrinsics.areEqual(slider.getValues().get(0), slider.getValueFrom()) && Intrinsics.areEqual(slider.getValues().get(1), slider.getValueTo())) {
                            this$0.f5280t0.remove(filter.getValue());
                            return;
                        }
                        Map<String, String> map = this$0.f5280t0;
                        String value = filter.getValue();
                        map.put(value, filter.getOptions().get((int) slider.getValues().get(0).floatValue()) + '-' + filter.getOptions().get((int) slider.getValues().get(1).floatValue()));
                    }
                });
                int i11 = 0;
                for (Object obj : performerAdditionalFilter.getOptions()) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    String str2 = (String) obj;
                    View inflate = x().inflate(R.layout.layout_additional_filters_slide_text, (ViewGroup) bind.d, false);
                    Objects.requireNonNull(inflate, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView = (TextView) inflate;
                    if (i11 == CollectionsKt.getLastIndex(performerAdditionalFilter.getOptions())) {
                        str2 = Intrinsics.stringPlus(str2, "+");
                    }
                    textView.setText(str2);
                    bind.d.addView(textView);
                    i11 = i12;
                }
                M0().f4637e.addView(bind.f4783a);
            } else {
                ItemPornstarsAdditionalFiltersRadioSectionBinding bind2 = ItemPornstarsAdditionalFiltersRadioSectionBinding.bind(x().inflate(R.layout.item_pornstars_additional_filters_radio_section, (ViewGroup) M0().f4637e, false));
                Intrinsics.checkNotNullExpressionValue(bind2, "inflate(\n            lay…          false\n        )");
                bind2.f4781b.setText(performerAdditionalFilter.getTitle());
                List<String> mutableList = CollectionsKt.toMutableList((Collection) performerAdditionalFilter.getOptions());
                String I = I(R.string.all);
                Intrinsics.checkNotNullExpressionValue(I, "getString(R.string.all)");
                mutableList.add(0, I);
                for (String str3 : mutableList) {
                    View inflate2 = x().inflate(R.layout.layout_additional_filters_radio_button, (ViewGroup) bind2.f4782c, false);
                    Objects.requireNonNull(inflate2, "null cannot be cast to non-null type android.widget.RadioButton");
                    RadioButton radioButton = (RadioButton) inflate2;
                    radioButton.setText(str3);
                    radioButton.setId(mutableList.indexOf(str3));
                    bind2.f4782c.addView(radioButton);
                }
                if (this.f5280t0.containsKey(performerAdditionalFilter.getValue())) {
                    String str4 = this.f5280t0.get(performerAdditionalFilter.getValue());
                    if (str4 == null) {
                        str4 = BuildConfig.FLAVOR;
                    }
                    i10 = performerAdditionalFilter.getOptions().indexOf(str4) + 1;
                }
                View childAt = bind2.f4782c.getChildAt(i10);
                Objects.requireNonNull(childAt, "null cannot be cast to non-null type android.widget.RadioButton");
                ((RadioButton) childAt).setChecked(true);
                bind2.f4782c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: s4.b
                    @Override // android.widget.RadioGroup.OnCheckedChangeListener
                    public final void onCheckedChanged(RadioGroup radioGroup, int i13) {
                        String str5;
                        PerformersFilterFragment this$0 = PerformersFilterFragment.this;
                        PerformerAdditionalFilter filter = performerAdditionalFilter;
                        KProperty<Object>[] kPropertyArr = PerformersFilterFragment.f5275u0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(filter, "$filter");
                        Objects.requireNonNull(this$0);
                        if (i13 == 0) {
                            this$0.f5280t0.remove(filter.getValue());
                            str5 = BuildConfig.FLAVOR;
                        } else {
                            str5 = filter.getOptions().get(i13 - 1);
                            this$0.f5280t0.put(filter.getValue(), str5);
                        }
                        for (PerformerIncompatibleFilterChoice performerIncompatibleFilterChoice : filter.getIncompatibleChoice()) {
                            for (String str6 : performerIncompatibleFilterChoice.getFilterValues()) {
                                List<PerformerAdditionalFilter> list2 = this$0.f5279s0;
                                if (list2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("filters");
                                    list2 = null;
                                }
                                Iterator<PerformerAdditionalFilter> it = list2.iterator();
                                int i14 = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        i14 = -1;
                                        break;
                                    } else if (Intrinsics.areEqual(it.next().getValue(), str6)) {
                                        break;
                                    } else {
                                        i14++;
                                    }
                                }
                                if (i14 > -1) {
                                    LinearLayout linearLayout = this$0.M0().f4637e;
                                    Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.contentContainer");
                                    ViewGroup viewGroup = (ViewGroup) t3.a.j(linearLayout, i14);
                                    if (Intrinsics.areEqual(performerIncompatibleFilterChoice.getOption(), str5)) {
                                        viewGroup.setVisibility(8);
                                        ((RadioButton) t3.a.j((RadioGroup) t3.a.j(viewGroup, 1), 0)).setChecked(true);
                                    } else {
                                        viewGroup.setVisibility(0);
                                    }
                                }
                            }
                        }
                    }
                });
                M0().f4637e.addView(bind2.f4780a);
            }
        }
    }
}
