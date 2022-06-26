import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CompinteractionComponent } from './compinteraction.component';

describe('CompinteractionComponent', () => {
  let component: CompinteractionComponent;
  let fixture: ComponentFixture<CompinteractionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CompinteractionComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CompinteractionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
