package com.app.pornhub.view.common;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.u0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.e;
import androidx.lifecycle.k;
import androidx.lifecycle.l;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import x1.a;

/* loaded from: classes.dex */
public final class FragmentViewBindingDelegate<T extends a> implements ReadOnlyProperty<Fragment, T> {

    /* renamed from: a  reason: collision with root package name */
    public final Fragment f4963a;

    /* renamed from: b  reason: collision with root package name */
    public final Function1<View, T> f4964b;

    /* renamed from: c  reason: collision with root package name */
    public Function1<? super T, Unit> f4965c;
    public T d;

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentViewBindingDelegate(Fragment fragment, Function1<? super View, ? extends T> viewBindingFactory, Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(viewBindingFactory, "viewBindingFactory");
        this.f4963a = fragment;
        this.f4964b = viewBindingFactory;
        this.f4965c = function1;
        fragment.f2009f0.a(new e(this) { // from class: com.app.pornhub.view.common.FragmentViewBindingDelegate.1

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ FragmentViewBindingDelegate<T> f4966a;

            /* renamed from: com.app.pornhub.view.common.FragmentViewBindingDelegate$1$a */
            /* loaded from: classes.dex */
            public static final class a<T> implements q<T> {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ FragmentViewBindingDelegate f4967a;

                public a(FragmentViewBindingDelegate fragmentViewBindingDelegate) {
                    this.f4967a = fragmentViewBindingDelegate;
                }

                @Override // androidx.lifecycle.q
                public final void a(T t2) {
                    Lifecycle b10 = ((k) t2).b();
                    final FragmentViewBindingDelegate fragmentViewBindingDelegate = this.f4967a;
                    b10.a(new e() { // from class: com.app.pornhub.view.common.FragmentViewBindingDelegate$1$onCreate$1$1
                        @Override // androidx.lifecycle.e
                        public /* synthetic */ void a(k kVar) {
                        }

                        @Override // androidx.lifecycle.e
                        public /* synthetic */ void b(k kVar) {
                        }

                        @Override // androidx.lifecycle.e
                        public /* synthetic */ void d(k kVar) {
                        }

                        @Override // androidx.lifecycle.e
                        public /* synthetic */ void e(k kVar) {
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // androidx.lifecycle.e
                        public void f(k owner) {
                            Intrinsics.checkNotNullParameter(owner, "owner");
                            FragmentViewBindingDelegate<T> fragmentViewBindingDelegate2 = fragmentViewBindingDelegate;
                            Function1<? super T, Unit> function1 = fragmentViewBindingDelegate2.f4965c;
                            if (function1 != 0) {
                                T t8 = fragmentViewBindingDelegate2.d;
                                Intrinsics.checkNotNull(t8);
                                function1.invoke(t8);
                            }
                            fragmentViewBindingDelegate.d = null;
                        }

                        @Override // androidx.lifecycle.e
                        public /* synthetic */ void g(k kVar) {
                        }
                    });
                }
            }

            {
                this.f4966a = this;
            }

            @Override // androidx.lifecycle.e
            public /* synthetic */ void a(k kVar) {
            }

            @Override // androidx.lifecycle.e
            public void b(k owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                p<k> pVar = this.f4966a.f4963a.f2011h0;
                Intrinsics.checkNotNullExpressionValue(pVar, "fragment.viewLifecycleOwnerLiveData");
                FragmentViewBindingDelegate<T> fragmentViewBindingDelegate = this.f4966a;
                pVar.f(fragmentViewBindingDelegate.f4963a, new a(fragmentViewBindingDelegate));
            }

            @Override // androidx.lifecycle.e
            public /* synthetic */ void d(k kVar) {
            }

            @Override // androidx.lifecycle.e
            public /* synthetic */ void e(k kVar) {
            }

            @Override // androidx.lifecycle.e
            public /* synthetic */ void f(k kVar) {
            }

            @Override // androidx.lifecycle.e
            public /* synthetic */ void g(k kVar) {
            }
        });
    }

    @Override // kotlin.properties.ReadOnlyProperty
    /* renamed from: a */
    public T getValue(Fragment thisRef, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        T t2 = this.d;
        if (t2 != null) {
            return t2;
        }
        u0 u0Var = (u0) this.f4963a.K();
        u0Var.d();
        l lVar = u0Var.f2268f;
        Intrinsics.checkNotNullExpressionValue(lVar, "fragment.viewLifecycleOwner.lifecycle");
        if (lVar.f2375b.compareTo(Lifecycle.State.INITIALIZED) >= 0) {
            Function1<View, T> function1 = this.f4964b;
            View v02 = thisRef.v0();
            Intrinsics.checkNotNullExpressionValue(v02, "thisRef.requireView()");
            T invoke = function1.invoke(v02);
            this.d = invoke;
            return invoke;
        }
        throw new IllegalStateException("Should not attempt to get bindings when Fragment views are destroyed.");
    }
}
