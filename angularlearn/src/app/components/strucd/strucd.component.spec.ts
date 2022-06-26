import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StrucdComponent } from './strucd.component';

describe('StrucdComponent', () => {
  let component: StrucdComponent;
  let fixture: ComponentFixture<StrucdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StrucdComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(StrucdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
