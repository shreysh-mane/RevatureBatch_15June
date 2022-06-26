import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StrucdirectiveComponent } from './strucdirective.component';

describe('StrucdirectiveComponent', () => {
  let component: StrucdirectiveComponent;
  let fixture: ComponentFixture<StrucdirectiveComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StrucdirectiveComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(StrucdirectiveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
