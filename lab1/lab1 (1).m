%2021E075
%part 01 a
 x = sym('x');

 y=1/(1+x^2);
 figure(1);
 ezplot(y);

 y1=1/(x^2);
 figure(2);
 ezplot(y1);

y2=log(x);
figure(3);
 ezplot(y2);

 y3=exp(x);
 figure(4);
 ezplot(y3);

 y4=exp(-x);
 figure(5);
 ezplot(y4);

  figure(6);
  y5 = exp(x)*sin(20*x);
  ezplot(y5,[0,3]);

  figure(7);
  y6 = exp(-x)*sin(20*x);
  ezplot(y6,[0,3]);

 figure(8);
 t=0:0.0001:0.0625;
 y7=square(2*pi*60*t);
 plot(t,y7);