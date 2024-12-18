%2021E075
%part 01 b
t = sym('t');

f= sin(t);
h =1;
t= 0:0.01:2*pi;
f_t = eval(subs(f));
h_t = ones(1,length(t));
z_t = conv(f_t, h_t, 'same');
figure;
plot(t,f_t);
xlabel('t');ylabel('f(t)');
figure(2);
plot(t,h_t);
xlabel('t');ylabel('h(t)');
figure(3);
plot(t,z_t);
xlabel('t');ylable('z(t)');
