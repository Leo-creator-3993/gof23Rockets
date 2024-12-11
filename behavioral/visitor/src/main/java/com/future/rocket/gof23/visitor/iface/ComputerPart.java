package com.future.rocket.gof23.visitor.iface;

public interface ComputerPart {
      void accept(ComputerPartVisitor computerPartVisitor);
}
