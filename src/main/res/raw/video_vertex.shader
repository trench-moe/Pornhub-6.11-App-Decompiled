uniform int eye;
uniform mat4 invProj;

attribute vec2 vPos;

varying vec3 vDir;

void main(void) {
    gl_Position = vec4(vPos, 1.0, 1.0);
    vec4 dir = invProj * gl_Position;
    vDir = dir.xyz / dir.w;
}
