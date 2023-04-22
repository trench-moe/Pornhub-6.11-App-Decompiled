package z0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final b f18680a;

    /* loaded from: classes2.dex */
    public static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f18681a;

        /* renamed from: b  reason: collision with root package name */
        public final d f18682b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f18683c = true;

        public a(TextView textView) {
            this.f18681a = textView;
            this.f18682b = new d(textView);
        }

        @Override // z0.f.b
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            if (this.f18683c) {
                int length = inputFilterArr.length;
                for (InputFilter inputFilter : inputFilterArr) {
                    if (inputFilter == this.f18682b) {
                        return inputFilterArr;
                    }
                }
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
                inputFilterArr2[length] = this.f18682b;
                return inputFilterArr2;
            }
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                if (inputFilterArr[i10] instanceof d) {
                    sparseArray.put(i10, inputFilterArr[i10]);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length2 = inputFilterArr.length;
            InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i11 = 0;
            for (int i12 = 0; i12 < length2; i12++) {
                if (sparseArray.indexOfKey(i12) < 0) {
                    inputFilterArr3[i11] = inputFilterArr[i12];
                    i11++;
                }
            }
            return inputFilterArr3;
        }

        @Override // z0.f.b
        public boolean b() {
            return this.f18683c;
        }

        @Override // z0.f.b
        public void c(boolean z10) {
            if (z10) {
                this.f18681a.setTransformationMethod(e(this.f18681a.getTransformationMethod()));
            }
        }

        @Override // z0.f.b
        public void d(boolean z10) {
            this.f18683c = z10;
            this.f18681a.setTransformationMethod(e(this.f18681a.getTransformationMethod()));
            this.f18681a.setFilters(a(this.f18681a.getFilters()));
        }

        @Override // z0.f.b
        public TransformationMethod e(TransformationMethod transformationMethod) {
            if (!this.f18683c) {
                if (transformationMethod instanceof h) {
                    transformationMethod = ((h) transformationMethod).f18690c;
                }
                return transformationMethod;
            }
            if (!(transformationMethod instanceof h) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                return new h(transformationMethod);
            }
            return transformationMethod;
        }
    }

    /* loaded from: classes2.dex */
    public static class b {
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        public void c(boolean z10) {
            throw null;
        }

        public void d(boolean z10) {
            throw null;
        }

        public TransformationMethod e(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public static class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public final a f18684a;

        public c(TextView textView) {
            this.f18684a = new a(textView);
        }

        @Override // z0.f.b
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return f() ? inputFilterArr : this.f18684a.a(inputFilterArr);
        }

        @Override // z0.f.b
        public boolean b() {
            return this.f18684a.f18683c;
        }

        @Override // z0.f.b
        public void c(boolean z10) {
            if (f()) {
                return;
            }
            a aVar = this.f18684a;
            Objects.requireNonNull(aVar);
            if (z10) {
                aVar.f18681a.setTransformationMethod(aVar.e(aVar.f18681a.getTransformationMethod()));
            }
        }

        @Override // z0.f.b
        public void d(boolean z10) {
            if (f()) {
                this.f18684a.f18683c = z10;
            } else {
                this.f18684a.d(z10);
            }
        }

        @Override // z0.f.b
        public TransformationMethod e(TransformationMethod transformationMethod) {
            return f() ? transformationMethod : this.f18684a.e(transformationMethod);
        }

        public final boolean f() {
            return !androidx.emoji2.text.d.c();
        }
    }

    public f(TextView textView, boolean z10) {
        cb.e.u(textView, "textView cannot be null");
        if (z10) {
            this.f18680a = new a(textView);
        } else {
            this.f18680a = new c(textView);
        }
    }
}
