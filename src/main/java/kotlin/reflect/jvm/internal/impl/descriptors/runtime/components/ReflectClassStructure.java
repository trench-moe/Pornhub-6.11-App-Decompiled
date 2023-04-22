package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ReflectClassStructure {
    public static final ReflectClassStructure INSTANCE = new ReflectClassStructure();

    private ReflectClassStructure() {
    }

    private final ClassLiteralValue classLiteralValue(Class<?> cls) {
        int i10 = 0;
        while (cls.isArray()) {
            i10++;
            cls = cls.getComponentType();
            Intrinsics.checkNotNullExpressionValue(cls, "currentClass.componentType");
        }
        if (!cls.isPrimitive()) {
            ClassId classId = ReflectClassUtilKt.getClassId(cls);
            JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
            FqName asSingleFqName = classId.asSingleFqName();
            Intrinsics.checkNotNullExpressionValue(asSingleFqName, "javaClassId.asSingleFqName()");
            ClassId mapJavaToKotlin = javaToKotlinClassMap.mapJavaToKotlin(asSingleFqName);
            if (mapJavaToKotlin != null) {
                classId = mapJavaToKotlin;
            }
            return new ClassLiteralValue(classId, i10);
        } else if (Intrinsics.areEqual(cls, Void.TYPE)) {
            ClassId classId2 = ClassId.topLevel(StandardNames.FqNames.unit.toSafe());
            Intrinsics.checkNotNullExpressionValue(classId2, "topLevel(StandardNames.FqNames.unit.toSafe())");
            return new ClassLiteralValue(classId2, i10);
        } else {
            PrimitiveType primitiveType = JvmPrimitiveType.get(cls.getName()).getPrimitiveType();
            Intrinsics.checkNotNullExpressionValue(primitiveType, "get(currentClass.name).primitiveType");
            if (i10 > 0) {
                ClassId classId3 = ClassId.topLevel(primitiveType.getArrayTypeFqName());
                Intrinsics.checkNotNullExpressionValue(classId3, "topLevel(primitiveType.arrayTypeFqName)");
                return new ClassLiteralValue(classId3, i10 - 1);
            }
            ClassId classId4 = ClassId.topLevel(primitiveType.getTypeFqName());
            Intrinsics.checkNotNullExpressionValue(classId4, "topLevel(primitiveType.typeFqName)");
            return new ClassLiteralValue(classId4, i10);
        }
    }

    private final void loadConstructorAnnotations(Class<?> cls, KotlinJvmBinaryClass.MemberVisitor memberVisitor) {
        Constructor<?>[] constructorArr;
        int i10;
        int i11;
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        Intrinsics.checkNotNullExpressionValue(declaredConstructors, "klass.declaredConstructors");
        int length = declaredConstructors.length;
        int i12 = 0;
        while (i12 < length) {
            Constructor<?> constructor = declaredConstructors[i12];
            int i13 = i12 + 1;
            Name name = SpecialNames.INIT;
            SignatureSerializer signatureSerializer = SignatureSerializer.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(constructor, "constructor");
            KotlinJvmBinaryClass.MethodAnnotationVisitor visitMethod = memberVisitor.visitMethod(name, signatureSerializer.constructorDesc(constructor));
            if (visitMethod == null) {
                constructorArr = declaredConstructors;
                i10 = length;
                i11 = i13;
            } else {
                Annotation[] declaredAnnotations = constructor.getDeclaredAnnotations();
                Intrinsics.checkNotNullExpressionValue(declaredAnnotations, "constructor.declaredAnnotations");
                int length2 = declaredAnnotations.length;
                int i14 = 0;
                while (i14 < length2) {
                    Annotation annotation = declaredAnnotations[i14];
                    i14++;
                    Intrinsics.checkNotNullExpressionValue(annotation, "annotation");
                    processAnnotation(visitMethod, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                Intrinsics.checkNotNullExpressionValue(parameterAnnotations, "parameterAnnotations");
                if (!(parameterAnnotations.length == 0)) {
                    int length3 = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length4 = parameterAnnotations.length;
                    int i15 = 0;
                    while (i15 < length4) {
                        Annotation[] annotations = parameterAnnotations[i15];
                        int i16 = i15 + 1;
                        Intrinsics.checkNotNullExpressionValue(annotations, "annotations");
                        int length5 = annotations.length;
                        int i17 = 0;
                        while (i17 < length5) {
                            Annotation annotation2 = annotations[i17];
                            i17++;
                            Constructor<?>[] constructorArr2 = declaredConstructors;
                            Class<?> javaClass = JvmClassMappingKt.getJavaClass(JvmClassMappingKt.getAnnotationClass(annotation2));
                            int i18 = length;
                            int i19 = i13;
                            ClassId classId = ReflectClassUtilKt.getClassId(javaClass);
                            int i20 = length3;
                            Intrinsics.checkNotNullExpressionValue(annotation2, "annotation");
                            KotlinJvmBinaryClass.AnnotationArgumentVisitor visitParameterAnnotation = visitMethod.visitParameterAnnotation(i15 + length3, classId, new ReflectAnnotationSource(annotation2));
                            if (visitParameterAnnotation != null) {
                                INSTANCE.processAnnotationArguments(visitParameterAnnotation, annotation2, javaClass);
                            }
                            length = i18;
                            declaredConstructors = constructorArr2;
                            i13 = i19;
                            length3 = i20;
                        }
                        i15 = i16;
                    }
                }
                constructorArr = declaredConstructors;
                i10 = length;
                i11 = i13;
                visitMethod.visitEnd();
            }
            length = i10;
            declaredConstructors = constructorArr;
            i12 = i11;
        }
    }

    private final void loadFieldAnnotations(Class<?> cls, KotlinJvmBinaryClass.MemberVisitor memberVisitor) {
        Field[] declaredFields = cls.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "klass.declaredFields");
        int length = declaredFields.length;
        int i10 = 0;
        while (i10 < length) {
            Field field = declaredFields[i10];
            i10++;
            Name identifier = Name.identifier(field.getName());
            Intrinsics.checkNotNullExpressionValue(identifier, "identifier(field.name)");
            SignatureSerializer signatureSerializer = SignatureSerializer.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(field, "field");
            KotlinJvmBinaryClass.AnnotationVisitor visitField = memberVisitor.visitField(identifier, signatureSerializer.fieldDesc(field), null);
            if (visitField != null) {
                Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
                Intrinsics.checkNotNullExpressionValue(declaredAnnotations, "field.declaredAnnotations");
                int length2 = declaredAnnotations.length;
                int i11 = 0;
                while (i11 < length2) {
                    Annotation annotation = declaredAnnotations[i11];
                    i11++;
                    Intrinsics.checkNotNullExpressionValue(annotation, "annotation");
                    processAnnotation(visitField, annotation);
                }
                visitField.visitEnd();
            }
        }
    }

    private final void loadMethodAnnotations(Class<?> cls, KotlinJvmBinaryClass.MemberVisitor memberVisitor) {
        Method[] methodArr;
        int i10;
        Method[] declaredMethods = cls.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "klass.declaredMethods");
        int length = declaredMethods.length;
        int i11 = 0;
        while (i11 < length) {
            Method method = declaredMethods[i11];
            i11++;
            Name identifier = Name.identifier(method.getName());
            Intrinsics.checkNotNullExpressionValue(identifier, "identifier(method.name)");
            SignatureSerializer signatureSerializer = SignatureSerializer.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(method, "method");
            KotlinJvmBinaryClass.MethodAnnotationVisitor visitMethod = memberVisitor.visitMethod(identifier, signatureSerializer.methodDesc(method));
            if (visitMethod == null) {
                methodArr = declaredMethods;
                i10 = length;
            } else {
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                Intrinsics.checkNotNullExpressionValue(declaredAnnotations, "method.declaredAnnotations");
                int length2 = declaredAnnotations.length;
                int i12 = 0;
                while (i12 < length2) {
                    Annotation annotation = declaredAnnotations[i12];
                    i12++;
                    Intrinsics.checkNotNullExpressionValue(annotation, "annotation");
                    processAnnotation(visitMethod, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                Intrinsics.checkNotNullExpressionValue(parameterAnnotations, "method.parameterAnnotations");
                int length3 = parameterAnnotations.length;
                int i13 = 0;
                while (i13 < length3) {
                    Annotation[] annotations = parameterAnnotations[i13];
                    int i14 = i13 + 1;
                    Intrinsics.checkNotNullExpressionValue(annotations, "annotations");
                    int length4 = annotations.length;
                    int i15 = 0;
                    while (i15 < length4) {
                        Annotation annotation2 = annotations[i15];
                        i15++;
                        Class<?> javaClass = JvmClassMappingKt.getJavaClass(JvmClassMappingKt.getAnnotationClass(annotation2));
                        Method[] methodArr2 = declaredMethods;
                        ClassId classId = ReflectClassUtilKt.getClassId(javaClass);
                        int i16 = length;
                        Intrinsics.checkNotNullExpressionValue(annotation2, "annotation");
                        KotlinJvmBinaryClass.AnnotationArgumentVisitor visitParameterAnnotation = visitMethod.visitParameterAnnotation(i13, classId, new ReflectAnnotationSource(annotation2));
                        if (visitParameterAnnotation != null) {
                            INSTANCE.processAnnotationArguments(visitParameterAnnotation, annotation2, javaClass);
                        }
                        declaredMethods = methodArr2;
                        length = i16;
                    }
                    i13 = i14;
                }
                methodArr = declaredMethods;
                i10 = length;
                visitMethod.visitEnd();
            }
            declaredMethods = methodArr;
            length = i10;
        }
    }

    private final void processAnnotation(KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor, Annotation annotation) {
        Class<?> javaClass = JvmClassMappingKt.getJavaClass(JvmClassMappingKt.getAnnotationClass(annotation));
        KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation = annotationVisitor.visitAnnotation(ReflectClassUtilKt.getClassId(javaClass), new ReflectAnnotationSource(annotation));
        if (visitAnnotation == null) {
            return;
        }
        INSTANCE.processAnnotationArguments(visitAnnotation, annotation, javaClass);
    }

    private final void processAnnotationArgumentValue(KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitor, Name name, Object obj) {
        Set set;
        Class<?> cls = obj.getClass();
        if (Intrinsics.areEqual(cls, Class.class)) {
            annotationArgumentVisitor.visitClassLiteral(name, classLiteralValue((Class) obj));
            return;
        }
        set = ReflectKotlinClassKt.TYPES_ELIGIBLE_FOR_SIMPLE_VISIT;
        if (set.contains(cls)) {
            annotationArgumentVisitor.visit(name, obj);
        } else if (ReflectClassUtilKt.isEnumClassOrSpecializedEnumEntryClass(cls)) {
            if (!cls.isEnum()) {
                cls = cls.getEnclosingClass();
            }
            Intrinsics.checkNotNullExpressionValue(cls, "if (clazz.isEnum) clazz else clazz.enclosingClass");
            ClassId classId = ReflectClassUtilKt.getClassId(cls);
            Name identifier = Name.identifier(((Enum) obj).name());
            Intrinsics.checkNotNullExpressionValue(identifier, "identifier((value as Enum<*>).name)");
            annotationArgumentVisitor.visitEnum(name, classId, identifier);
        } else if (Annotation.class.isAssignableFrom(cls)) {
            Class<?>[] interfaces = cls.getInterfaces();
            Intrinsics.checkNotNullExpressionValue(interfaces, "clazz.interfaces");
            Class<?> annotationClass = (Class) ArraysKt.single(interfaces);
            Intrinsics.checkNotNullExpressionValue(annotationClass, "annotationClass");
            KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation = annotationArgumentVisitor.visitAnnotation(name, ReflectClassUtilKt.getClassId(annotationClass));
            if (visitAnnotation == null) {
                return;
            }
            processAnnotationArguments(visitAnnotation, (Annotation) obj, annotationClass);
        } else if (!cls.isArray()) {
            throw new UnsupportedOperationException("Unsupported annotation argument value (" + cls + "): " + obj);
        } else {
            KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray = annotationArgumentVisitor.visitArray(name);
            if (visitArray == null) {
                return;
            }
            Class<?> componentType = cls.getComponentType();
            int i10 = 0;
            if (componentType.isEnum()) {
                Intrinsics.checkNotNullExpressionValue(componentType, "componentType");
                ClassId classId2 = ReflectClassUtilKt.getClassId(componentType);
                Object[] objArr = (Object[]) obj;
                int length = objArr.length;
                while (i10 < length) {
                    Object obj2 = objArr[i10];
                    i10++;
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                    Name identifier2 = Name.identifier(((Enum) obj2).name());
                    Intrinsics.checkNotNullExpressionValue(identifier2, "identifier((element as Enum<*>).name)");
                    visitArray.visitEnum(classId2, identifier2);
                }
            } else if (Intrinsics.areEqual(componentType, Class.class)) {
                Object[] objArr2 = (Object[]) obj;
                int length2 = objArr2.length;
                while (i10 < length2) {
                    Object obj3 = objArr2[i10];
                    i10++;
                    Objects.requireNonNull(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                    visitArray.visitClassLiteral(classLiteralValue((Class) obj3));
                }
            } else if (Annotation.class.isAssignableFrom(componentType)) {
                Object[] objArr3 = (Object[]) obj;
                int length3 = objArr3.length;
                while (i10 < length3) {
                    Object obj4 = objArr3[i10];
                    i10++;
                    Intrinsics.checkNotNullExpressionValue(componentType, "componentType");
                    KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation2 = visitArray.visitAnnotation(ReflectClassUtilKt.getClassId(componentType));
                    if (visitAnnotation2 != null) {
                        Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.Annotation");
                        processAnnotationArguments(visitAnnotation2, (Annotation) obj4, componentType);
                    }
                }
            } else {
                Object[] objArr4 = (Object[]) obj;
                int length4 = objArr4.length;
                while (i10 < length4) {
                    Object obj5 = objArr4[i10];
                    i10++;
                    visitArray.visit(obj5);
                }
            }
            visitArray.visitEnd();
        }
    }

    private final void processAnnotationArguments(KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitor, Annotation annotation, Class<?> cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "annotationType.declaredMethods");
        int length = declaredMethods.length;
        int i10 = 0;
        while (i10 < length) {
            Method method = declaredMethods[i10];
            i10++;
            try {
                Object invoke = method.invoke(annotation, new Object[0]);
                Intrinsics.checkNotNull(invoke);
                Name identifier = Name.identifier(method.getName());
                Intrinsics.checkNotNullExpressionValue(identifier, "identifier(method.name)");
                processAnnotationArgumentValue(annotationArgumentVisitor, identifier, invoke);
            } catch (IllegalAccessException unused) {
            }
        }
        annotationArgumentVisitor.visitEnd();
    }

    public final void loadClassAnnotations(Class<?> klass, KotlinJvmBinaryClass.AnnotationVisitor visitor) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        Annotation[] declaredAnnotations = klass.getDeclaredAnnotations();
        Intrinsics.checkNotNullExpressionValue(declaredAnnotations, "klass.declaredAnnotations");
        int length = declaredAnnotations.length;
        int i10 = 0;
        while (i10 < length) {
            Annotation annotation = declaredAnnotations[i10];
            i10++;
            Intrinsics.checkNotNullExpressionValue(annotation, "annotation");
            processAnnotation(visitor, annotation);
        }
        visitor.visitEnd();
    }

    public final void visitMembers(Class<?> klass, KotlinJvmBinaryClass.MemberVisitor memberVisitor) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(memberVisitor, "memberVisitor");
        loadMethodAnnotations(klass, memberVisitor);
        loadConstructorAnnotations(klass, memberVisitor);
        loadFieldAnnotations(klass, memberVisitor);
    }
}
